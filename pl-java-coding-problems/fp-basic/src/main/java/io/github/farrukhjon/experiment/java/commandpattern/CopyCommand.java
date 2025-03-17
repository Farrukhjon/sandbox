package io.github.farrukhjon.experiment.java.commandpattern;

public class CopyCommand implements Command {

    private final IODevice action;

    public CopyCommand(IODevice action) {
        this.action = action;
    }

    @Override
    public void execute() {
        action.copy();
    }

}
