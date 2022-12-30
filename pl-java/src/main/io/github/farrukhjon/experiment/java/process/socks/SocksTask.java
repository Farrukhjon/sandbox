package io.github.farrukhjon.experiment.java.process.socks;


import static java.lang.Runtime.getRuntime;

import io.github.farrukhjon.experiment.java.process.Account;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.concurrent.Callable;

public class SocksTask implements Callable<Optional<Socks>> {

  private static final String SSHPASS = "sshpass";
  private static final String SSH =
      "ssh -nfN -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null -o ConnectTimeout=30 -o LogLevel=ERROR -D";

  private final Account account;
  private final String bindAddress;
  private final int bindPort;

  public SocksTask(final String bindAddress, final int bindPort, final Account account) {
    this.bindAddress = bindAddress;
    this.account = account;
    this.bindPort = bindPort;
  }

  @Override
  public Optional<Socks> call() throws Exception {
    Socks socks = null;
    String password = account.getPassword();
    String remoteUsername = account.getUsername();
    String host = account.getHost();
    String port = String.valueOf(account.getPort());
    String cmd = buildCommand(remoteUsername, password, host, port);
    Process process = getRuntime().exec(cmd);
    String error = consumeProcessErrors(process);
    if (!error.isEmpty()) {
      if (error.contains("Connection timed out")) {
        throw new RuntimeException(error);
      }
      if (error.contains("Permission denied")) {
        throw new RuntimeException(error);
      }
      if (error.contains("Address already in use")) {
        throw new RuntimeException(error);
      }
      System.out.println(error);
    }
    final int waitFor = process.waitFor();
    if (waitFor == 0 && error.isEmpty()) {
      socks = new Socks();
      socks.setPort(bindPort);
      socks.setHost(bindAddress);
    }
    return Optional.ofNullable(socks);
  }

  private String consumeProcessErrors(final Process process) throws IOException {
    final InputStream errorStream = process.getErrorStream();
    final BufferedReader reader = new BufferedReader(new InputStreamReader(errorStream));
    String error = reader.readLine();
    return error;
  }

  private String buildCommand(final String username, final String password, final String host, final String port) {
    return SSHPASS +
        " -p " +
        password +
        " " +
        SSH +
        " " +
        bindAddress +
        ":" +
        bindPort +
        " " +
        username +
        "@" +
        host +
        " -p " +
        port;
  }
}
