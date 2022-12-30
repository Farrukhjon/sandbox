package io.github.farrukhjon.experiment.money.repository;

import io.github.farrukhjon.experiment.money.exception.MoneyTransferException;
import io.github.farrukhjon.experiment.money.model.Account;
import io.github.farrukhjon.experiment.money.model.Transaction;

import java.util.Collection;
import java.util.List;

public class JdbcAccountDaoImpl implements AccountDao {

    @Override
    public Account createAccount(Account account) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Account findAccountById(int accountId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Account> getAllAccounts() {
        throw new UnsupportedOperationException();
    }


    @Override
    public List<Account> getAllAccountsOf(int size, String sortBy) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Transaction updateBalance(Transaction transaction) throws MoneyTransferException {
        throw new UnsupportedOperationException();
    }

}
