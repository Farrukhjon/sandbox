const {describe, beforeAll, afterAll, expect, test} = require('@jest/globals');
const {EventHubEmulatorResource} = require('../src/EventhubEmulatorResource.js');
const {EventHubConsumerClient, EventHubProducerClient} = require('@azure/event-hubs');
const {v4: uuidv4} = require('uuid');
require('dotenv').config({
  path: ['./.env', '../../.env'],
});

const eventhubEmulator = new EventHubEmulatorResource();

describe('Should start and stop eventhub emulator successfully', () => {
    let producerClient, consumerClient;

    beforeAll(async () => {
      await eventhubEmulator.start().then(() => {
        const connectionString = eventhubEmulator.connectionStringLocalhostToMappedPort;
        const eventHubName = eventhubEmulator.eventHubName;
        const consumerGroup = eventhubEmulator.eventHubConsumerGroup;
        producerClient = new EventHubProducerClient(connectionString, eventHubName);
        consumerClient = new EventHubConsumerClient(consumerGroup, connectionString, eventHubName);
      });
    }, 15_000);

    afterAll(async () => {
      await producerClient.close();
      await consumerClient.close();
      await eventhubEmulator.stop();
    });

    test('Should check the eventhub _connection string formats for testcontainers', () => {
      const externalConnectionString = eventhubEmulator.connectionStringContainerToExposedPort;
      expect(externalConnectionString).toBe(
        `Endpoint=sb://${eventhubEmulator.containerName}:5672;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=SAS_KEY_VALUE;UseDevelopmentEmulator=true;EntityPath=eh1`,
      );
      const internalConnectionString = eventhubEmulator.connectionStringLocalhostToMappedPort;
      expect(internalConnectionString).toBe(
        `Endpoint=sb://localhost:${eventhubEmulator.mappedPort};SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=SAS_KEY_VALUE;UseDevelopmentEmulator=true;EntityPath=eh1`,
      );
    });

    test('Should send and receive batch events', async () => {
      const receivedEvents = [];
      const partitionIds = await producerClient.getPartitionIds();
      const partitionId = partitionIds[0];
      const subscription = consumerClient.subscribe(partitionId, {
        processEvents: async (events) => {
          receivedEvents.push(...events.map((e) => e.body));
          if (receivedEvents.length >= testEvents.length) {
            await subscription.close();
          }
        },
        processError: async (err) => {
          await new Promise(() => {
            console.error('Error:', err);
          });
        },
      });
      const testEvents = [
        {body: `Event 1 - ${uuidv4()}`},
        {body: `Event 2 - ${uuidv4()}`},
        {body: `Event 3 - ${uuidv4()}`},
      ];
      const batch = await producerClient.createBatch();
      testEvents.forEach((event) => batch.tryAdd(event));
      await producerClient.sendBatch(batch);
      console.log(
        'Events sent:',
        testEvents.map((e) => e.body),
      );
      await new Promise((resolve) => setTimeout(resolve, 5000));
      await subscription.close();
      console.log('Events received:', receivedEvents);
      expect(receivedEvents).toEqual(expect.arrayContaining(testEvents.map((e) => e.body)));
    }, 10_000);
  },
);
