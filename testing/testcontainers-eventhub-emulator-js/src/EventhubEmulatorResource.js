const {GenericContainer, Network, Wait} = require('testcontainers');
const path = require('path');
const {execSync} = require('child_process');

/**
 * Azure eventhub emulator resource provider.
 * The emulator is encapsulated into a generic testcontainers.
 *
 */
const AZURITE_IMG = 'mcr.microsoft.com/azure-storage/azurite:latest';
const EVENTHUBS_EMULATOR_IMG = 'mcr.microsoft.com/azure-messaging/eventhubs-emulator:latest';
const AZURITE_NET_ALIAS = 'azurite';
const EVENTHUBS_EMULATOR_NET_ALIAS = 'eventhubsEmulator';
const EVENT_HUB_EXPOSED_PORT = 5672;
const LOCALHOST_NAME = 'localhost';

class EventHubEmulatorResource {
  constructor() {
    this.eventHubConnectionString = process.env.EVENTHUB_CONNECTION_STRING;
    if (!this.eventHubConnectionString) {
      throw new Error('The EVENTHUB_CONNECTION_STRING environment variable is not provided!');
    }
  }

  async start() {
    console.log('Starting containers');
    this.network = await new Network().start();
    this.azuriteContainer = await new GenericContainer(AZURITE_IMG)
      .withExposedPorts(10000, 10001, 10002)
      .withNetwork(this.network)
      .withNetworkAliases(AZURITE_NET_ALIAS)
      .withWaitStrategy(Wait.forLogMessage('Azurite Table service is successfully listening at'))
      .withLogConsumer((stream) => {
        stream.on('data', (line) => console.log(line));
        stream.on('err', (line) => console.error(line));
        stream.on('end', () => console.log('Stream closed'));
      })
      .start();
    this.eventHubsEmulatorContainer = await new GenericContainer(EVENTHUBS_EMULATOR_IMG)
      .withExposedPorts(EVENT_HUB_EXPOSED_PORT)
      .withNetwork(this.network)
      .withNetworkAliases(EVENTHUBS_EMULATOR_NET_ALIAS)
      .withEnvironment({
        BLOB_SERVER: AZURITE_NET_ALIAS,
        METADATA_SERVER: AZURITE_NET_ALIAS,
        ACCEPT_EULA: 'Y',
      })
      .withCopyFilesToContainer([
        {
          source: path.join(__dirname, 'docker/config.json'),
          target: '/Eventhubs_Emulator/ConfigFiles/Config.json',
        },
      ])
      .withLogConsumer((stream) => {
        stream.on('data', (line) => console.log(line));
        stream.on('err', (line) => console.error(line));
        stream.on('end', () => console.log('Stream closed'));
      })
      .withWaitStrategy(Wait.forLogMessage('Emulator Service is Successfully Up!'))
      .start();
  }

  async stop() {
    console.log('Stopping eventhub emulator containers');
    if (this.eventHubsEmulatorContainer) {
      await this.eventHubsEmulatorContainer.stop();
      this.eventHubsEmulatorContainer = null;
    }
    if (this.azuriteContainer) {
      await this.azuriteContainer.stop();
      this.azuriteContainer = null;
    }
    if (this.network) {
      await this.network.stop();
      this.network = null;
    }
    // Ensures the 'Ryuk' helper container is stopped.
    try {
      console.log('Stopping the helper Ryuk testcontainer...');
      const containerIds = execSync('docker ps -q --filter "label=org.testcontainers.ryuk"')
        .toString()
        .trim()
        .split('\n')
        .filter((id) => id);
      if (containerIds.length > 0) {
        console.log(`Stopping containers: ${containerIds.join(', ')}`);
        execSync(`docker rm -f ${containerIds.join(' ')}`);
      }
      console.log('All Ryuk testcontainers stopped.');
    } catch (error) {
      console.error('Error stopping the Ryuk testcontainers:', error.message);
    }
  }

  /**
   * @type {string}
   */
  get eventHubName() {
    return process.env.EVENTHUB_NAME;
  }

  /**
   * @type {string}
   */
  get eventHubConsumerGroup() {
    return process.env.EVENTHUB_CONSUMER_GROUP;
  }

  /**
   * Eventhub emulator connection string having localhost to mapped port.
   * @returns {string} eventhub emulator connection string.
   */
  get connectionStringLocalhostToMappedPort() {
    return this.eventHubConnectionString.replace(LOCALHOST_NAME, `${LOCALHOST_NAME}:${this.mappedPort}`);
  }

  /**
   * Connection string container name to exposed port.
   * @returns {string} eventhub emulator connection string.
   */
  get connectionStringContainerToExposedPort() {
    return this.eventHubConnectionString.replace(LOCALHOST_NAME, `${this.containerName}:${EVENT_HUB_EXPOSED_PORT}`);
  }

  get mappedPort() {
    return this.eventHubsEmulatorContainer.getMappedPort(EVENT_HUB_EXPOSED_PORT);
  }

  get containerName() {
    return this.eventHubsEmulatorContainer.getName();
  }
}

module.exports = {
  EventHubEmulatorResource
};
