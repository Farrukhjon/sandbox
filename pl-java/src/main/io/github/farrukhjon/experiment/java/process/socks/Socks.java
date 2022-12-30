package io.github.farrukhjon.experiment.java.process.socks;

/**
 * Instance of the class responsible for holding socks descriptor.
 */
public class Socks {

  /**
   * Socks unique identifier process.
   */
  private int pid;

  /**
   * The host name of a socks proxy.
   */
  private String host;

  /**
   * The port of a socks proxy.
   */
  private int port;


  public String getHost() {
    return host;
  }

  public void setHost(final String host) {
    this.host = host;
  }


  public int getPort() {
    return port;
  }

  public void setPort(final int port) {
    this.port = port;
  }

  public int getPid() {
    return pid;
  }

  public void setPid(final int pid) {
    this.pid = pid;
  }

  @Override
  public String toString() {
      final String sb = "Socks{" + "host='" +
          host +
          '\'' +
          ", port=" +
          port +
          '}';
    return sb;
  }
}
