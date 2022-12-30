package io.github.farrukhjon.experiment.money.service;

import io.github.farrukhjon.experiment.money.model.Account;

import java.util.Comparator;

abstract public class AccountsSortStrategy {

    abstract Comparator<Account> sortBy();

}
