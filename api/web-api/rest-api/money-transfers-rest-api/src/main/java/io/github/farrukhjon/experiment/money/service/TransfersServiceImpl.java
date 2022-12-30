package io.github.farrukhjon.experiment.money.service;

import io.github.farrukhjon.experiment.money.exception.MoneyTransferException;
import io.github.farrukhjon.experiment.money.model.Account;
import io.github.farrukhjon.experiment.money.model.Transaction;
import io.github.farrukhjon.experiment.money.repository.AccountDao;

import java.util.List;

import static java.lang.String.format;

public class TransfersServiceImpl implements TransfersService {

    private AccountDao accountDao;

    public TransfersServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public Transaction transfer(Transaction transaction) throws MoneyTransferException {
        validate(transaction);
        return accountDao.updateBalance(transaction);
    }

    @Override
    public Account createAccount(Account account) {
        return accountDao.createAccount(account);
    }

    @Override
    public Account getAccountById(int id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public List<Account> findAccountsOf(int size, String sortedBy) {
        return accountDao.getAllAccountsOf(size, sortedBy);
    }

    private void validate(Transaction transaction) throws MoneyTransferException {
        Account fromAccount = transaction.getFromAccount();
        if (transaction.getAmount() > fromAccount.getBalance())
            throw new MoneyTransferException(format("No enough money in the balance of %s account", fromAccount.getAccountNumber()));
    }

}
