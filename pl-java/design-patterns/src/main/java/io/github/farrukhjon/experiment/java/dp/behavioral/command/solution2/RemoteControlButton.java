package io.github.farrukhjon.experiment.java.dp.behavioral.command.solution2;

public class RemoteControlButton {

    private ICommand command;

    public RemoteControlButton(ICommand command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

}
