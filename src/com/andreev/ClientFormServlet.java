package com.andreev;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class ClientFormServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String login = req.getParameter("num1");
        String password = req.getParameter("num2");

        Cookie loginCookie = new Cookie("login", login);
        Cookie passwordCookie = new Cookie("password", password);

        res.addCookie(loginCookie);
        res.addCookie(passwordCookie);


        res.sendRedirect("sq");

        //RequestDispatcher rd = req.getRequestDispatcher("/sq");
        //rd.forward(req, res);

    }

}
