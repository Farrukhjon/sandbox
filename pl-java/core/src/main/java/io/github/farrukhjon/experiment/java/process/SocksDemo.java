package io.github.farrukhjon.experiment.java.process;

import static java.lang.Runtime.getRuntime;

import java.io.IOException;

public class SocksDemo {

  public static void main(String[] args) throws IOException, InterruptedException {
    final String sshpass = "sshpass ";
    final String password = "Df7t59Fgcm";
    final String ssh = " ssh -nfN -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null -o ConnectTimeout=30 -o LogLevel=ERROR -D ";
    final String bindAddress = "127.0.0.1";
    final int port = 4112;
    final String username = "root";
    final String host = "37.220.38.105";
    final int rem_port = 22;
    final String cmd = sshpass +
        " -p " +
        password +
        ssh +
        bindAddress +
        ":" +
        port +
        " " +
        username +
        "@" +
        host +
        " -p " +
        rem_port;
    final Process exec = getRuntime().exec(cmd);
    exec.waitFor();
  }

}
