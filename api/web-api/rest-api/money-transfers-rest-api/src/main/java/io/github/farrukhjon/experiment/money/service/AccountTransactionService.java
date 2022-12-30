package io.github.farrukhjon.experiment.money.service;

import io.github.farrukhjon.experiment.money.exception.MoneyTransferException;
import io.github.farrukhjon.experiment.money.model.Account;

import java.math.BigDecimal;

public interface AccountTransactionService {

    void transfer(Account from, Account to, BigDecimal amount) throws MoneyTransferException;

}
