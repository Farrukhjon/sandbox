package io.github.farrukhjon.experiment.money.controller;

import io.github.farrukhjon.experiment.money.BaseUnitTest;
import io.github.farrukhjon.experiment.money.model.Account;
import io.github.farrukhjon.experiment.money.model.Client;
import io.github.farrukhjon.experiment.money.model.Transaction;
import io.github.farrukhjon.experiment.money.service.TransfersService;
import org.jboss.resteasy.api.validation.ResteasyViolationExceptionMapper;
import org.jboss.resteasy.core.Dispatcher;
import org.jboss.resteasy.mock.MockDispatcherFactory;
import org.jboss.resteasy.mock.MockHttpRequest;
import org.jboss.resteasy.mock.MockHttpResponse;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

import static javax.ws.rs.core.MediaType.APPLICATION_XML_TYPE;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class TransfersResourceUnitTest extends BaseUnitTest {

    @Mock
    private TransfersService transfersService;

    @InjectMocks
    private TransfersResource transfersResource;

    private Dispatcher dispatcher;


    @Before
    public void initMockService() {
        dispatcher = MockDispatcherFactory.createDispatcher();
        dispatcher.getRegistry().addSingletonResource(transfersResource);
        ResteasyViolationExceptionMapper exceptionMapper = new ResteasyViolationExceptionMapper();
        dispatcher.getProviderFactory().getExceptionMappers().put(ResteasyViolationExceptionMapper.class, exceptionMapper);
    }

    @Test
    public void testCreateNewAccount() throws Exception {
        //given:
        Account newAcc = new Account();
        newAcc.setId(1);
        Client client = new Client("Ali", "Valiev");
        Account account = new Account(client, "RUR", 1_000_000_000.0);
        when(transfersService.createAccount(Mockito.any()))
                .thenReturn(newAcc);
        String strXml = convertToStrXml(account, Account.class);
        MockHttpRequest createAccountRequest = MockHttpRequest
                .post("/accounts/create")
                .content(strXml.getBytes())
                .contentType(APPLICATION_XML_TYPE)
                .accept(APPLICATION_XML_TYPE);
        MockHttpResponse response = new MockHttpResponse();

        //when:
        dispatcher.invoke(createAccountRequest, response);
        int responseStatusCode = response.getStatus();
        String contentAsString = response.getContentAsString();
        Account newAccount = convertStrXmlToEntity(contentAsString, Account.class);

        //then:
        assertEquals(1, newAccount.getId());
        assertEquals(HttpServletResponse.SC_CREATED, responseStatusCode);
    }

    @Test
    public void testGetAccountByAccountNumber() throws Exception {
        String accountNumber = "0202020203030505";
        Account account = new Account();
        account.setAccountNumber(accountNumber);
        when(transfersService.getAccountById(Mockito.anyInt())).thenReturn(account);
        MockHttpResponse response = new MockHttpResponse();
        MockHttpRequest request = MockHttpRequest.get("accounts/1");
        dispatcher.invoke(request, response);

        assertEquals(HttpServletResponse.SC_OK, response.getStatus());
    }

    @Test
    public void testTransferMoneyBetweenTwoAccounts() throws Exception {
        String url = "/accounts/transfer";
        Transaction newTx = new Transaction();
        newTx.setAmount(1000);
        newTx.setFromAccount(new Account());
        newTx.setToAccount(new Account());
        newTx.setDate(new Date());
        newTx.setDescription("Blah Blah Blah");

        MockHttpResponse response = new MockHttpResponse();
        Transaction committedTx = new Transaction();
        committedTx.setId(1);
        committedTx.setCommitted(true);
        when(transfersService.transfer(Mockito.any())).thenReturn(committedTx);

        String str = convertToStrXml(newTx, Transaction.class);
        MockHttpRequest request = MockHttpRequest
                .put(url)
                .content(str.getBytes())
                .contentType(APPLICATION_XML_TYPE)
                .accept(APPLICATION_XML_TYPE);
        dispatcher.invoke(request, response);

        String contentAsString = response.getContentAsString();
        Transaction transaction = convertStrXmlToEntity(contentAsString, Transaction.class);

        assertEquals(HttpServletResponse.SC_OK, response.getStatus());

        assertEquals(1, transaction.getId());
        assertEquals(Boolean.TRUE, transaction.isCommitted());
    }


}