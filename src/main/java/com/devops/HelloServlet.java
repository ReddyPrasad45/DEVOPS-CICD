package com.devops;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Hello DevOps</title></head>");
        out.println("<body style='font-family:Arial;text-align:center;"
                + "background:#11998e;color:white;padding:80px;'>");

        out.println("<h1>Hello, DevOps Engineer!</h1>");
        out.println("<h2>Java Servlet is running successfully.</h2>");
        out.println("<p>Application: Hello DevOps CI/CD</p>");
        out.println("<p>Version: 1.0</p>");

        out.println("</body>");
        out.println("</html>");
    }
}