package com.example.handler;

import org.eclipse.jetty.server.Request;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

public class ToolHandler {
    public static void guidHandler(Request baseRequest, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        String body = UUID.randomUUID().toString();
        response.getWriter().print(body);

    }
}
