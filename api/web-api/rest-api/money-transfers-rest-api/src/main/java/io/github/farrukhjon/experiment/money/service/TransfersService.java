package io.github.farrukhjon.experiment.money.service;

import io.github.farrukhjon.experiment.money.exception.MoneyTransferException;
import io.github.farrukhjon.experiment.money.model.Account;
import io.github.farrukhjon.experiment.money.model.Transaction;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface TransfersService {

    Transaction transfer(@NotNull Transaction transaction) throws MoneyTransferException;

    Account createAccount(Account account);

    Account getAccountById(int accountNumber);

    List<Account> findAccountsOf(int size, String sortedBy);
}
