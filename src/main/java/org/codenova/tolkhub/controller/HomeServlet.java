package org.codenova.tolkhub.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/index")
public class  HomeServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if(true) {
            req.setAttribute("authentication", true);
        }else {
            req.setAttribute("authentication", false);
        }
        req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);
    }
}
