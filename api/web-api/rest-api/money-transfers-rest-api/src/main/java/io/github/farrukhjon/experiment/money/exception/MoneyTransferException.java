package io.github.farrukhjon.experiment.money.exception;

public class MoneyTransferException extends Exception {

    public MoneyTransferException(String message) {
        super(message);
    }

    public MoneyTransferException(Throwable cause) {
        super(cause);
    }

}
