package io.github.farrukhjon.experiment.tdd.sampling;

public class Poller {

  private final Probe probe;
  private final long timeOutInMs;
  private final long pollDelayInMs;

  public Poller(final Probe probe, final long timeOutInMs, final long pollDelayInMs) {
    this.probe = probe;
    this.timeOutInMs = timeOutInMs;
    this.pollDelayInMs = pollDelayInMs;
  }

  public void checkProbe() {
    final TimeOut timeOut = new TimeOut(this.timeOutInMs);
    while (!this.probe.isSatisfied() && !timeOut.isTimeOut()) {
      try {
        Thread.sleep(this.pollDelayInMs);
        this.probe.sample();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }

  private static class TimeOut {

    private final long timeOutInMs;

    private final long endTime;

    public TimeOut(final long durationInMs) {
      this.timeOutInMs = durationInMs;
      this.endTime = System.currentTimeMillis() + this.timeOutInMs;
    }

    public boolean isTimeOut() {
      return remainingTime() <= 0;
    }

    private long remainingTime() {
      return this.endTime - System.currentTimeMillis();
    }
  }
}
