package io.github.farrukhjon.experiment;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.http.ContentType.JSON;
import static org.eclipse.jetty.http.HttpStatus.OK_200;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestServletTest extends BaseTest {

    @Test
    public void whenGetPathIsCalledPayloadShouldReturn() {
        get("/test")
                .then()
                .statusCode(OK_200)
                .contentType(JSON)
                .body("payload", equalTo("100"));
    }

}
