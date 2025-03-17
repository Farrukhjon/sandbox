package io.github.farrukhjon.experiment.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import io.github.farrukhjon.experiment.rest.model.TestResponse;

import java.io.IOException;

public class TestServlet extends HttpServlet {

    private final ObjectMapper objectMapper;

    public TestServlet() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        validate(req);
        TestResponse res = new TestResponse();
        res.setPayload("100");
        String jsonStr = objectMapper.writer().writeValueAsString(res);
        resp.setContentType("application/json");
        resp.getWriter().println(jsonStr);
    }

    private void validate(HttpServletRequest req) {

    }
}
