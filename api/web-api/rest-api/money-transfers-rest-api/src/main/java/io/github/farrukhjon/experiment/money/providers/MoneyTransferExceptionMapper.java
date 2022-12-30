package io.github.farrukhjon.experiment.money.providers;

import io.github.farrukhjon.experiment.money.exception.MoneyTransferException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MoneyTransferExceptionMapper implements ExceptionMapper<MoneyTransferException> {

    @Override
    public Response toResponse(MoneyTransferException exception) {
        return Response
                .noContent()
                .build();
    }

}
