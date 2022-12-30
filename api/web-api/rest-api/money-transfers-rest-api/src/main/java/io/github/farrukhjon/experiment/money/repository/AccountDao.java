package io.github.farrukhjon.experiment.money.repository;

import io.github.farrukhjon.experiment.money.exception.MoneyTransferException;
import io.github.farrukhjon.experiment.money.model.Account;
import io.github.farrukhjon.experiment.money.model.Transaction;

import java.util.List;

public interface AccountDao {

    Account createAccount(Account account);

    Account findAccountById(int accountId);

    List<Account> getAllAccounts();

    List<Account> getAllAccountsOf(int size, String sortBy);

    Transaction updateBalance(Transaction transaction) throws MoneyTransferException;

}
