package io.github.farrukhjon.experiment.money;

import io.github.farrukhjon.experiment.money.controller.TransfersResource;
import io.github.farrukhjon.experiment.money.providers.MoneyTransferExceptionMapper;
import io.github.farrukhjon.experiment.money.repository.InMemoryAccountDaoImpl;
import io.github.farrukhjon.experiment.money.service.TransfersService;
import io.github.farrukhjon.experiment.money.service.TransfersServiceImpl;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/money")
public class MoneyTransfersApp extends Application {

    private Set<Object> singletons;

    public MoneyTransfersApp() {
        InMemoryAccountDaoImpl accountDao = new InMemoryAccountDaoImpl();
        TransfersService transactionService = new TransfersServiceImpl(accountDao);
        TransfersResource transfersResource = new TransfersResource();
        transfersResource.setTransfersService(transactionService);
        singletons = new HashSet<>();
        singletons.add(transfersResource);
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(MoneyTransferExceptionMapper.class);
        return classes;
    }
}
