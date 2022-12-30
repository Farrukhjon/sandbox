package io.github.farrukhjon.experiment.money.service;

import io.github.farrukhjon.experiment.money.exception.InsufficientFoundException;
import io.github.farrukhjon.experiment.money.exception.MoneyTransferException;
import io.github.farrukhjon.experiment.money.model.Account;

import java.math.BigDecimal;
import java.util.concurrent.locks.ReentrantLock;

public class AccountTransactionServiceImpl implements AccountTransactionService {

    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void transfer(Account from, Account to, BigDecimal amount) throws MoneyTransferException {
        lock.tryLock();
        try {
            BigDecimal withdrawn = withdraw(from, amount);
            deposit(to, withdrawn);
        } catch (InsufficientFoundException e) {
            throw new MoneyTransferException(e);
        } finally {
            lock.unlock();
        }
    }

    private BigDecimal withdraw(Account from, BigDecimal amount) throws InsufficientFoundException {
        BigDecimal balance = from.getBalance();
        if (balance.compareTo(BigDecimal.ZERO) > 0 && balance.compareTo(amount) > 0) {
            BigDecimal subtract = from.getBalance().subtract(amount);
            from.setBalance(subtract);
            return subtract;
        } else {
            throw new InsufficientFoundException(String.format("From account %s has not enough found to withdraw", from));
        }
    }

    private void deposit(Account to, BigDecimal withdrawn) {
        BigDecimal newValue = to.getBalance().add(withdrawn);
        to.setBalance(newValue);
    }

}
