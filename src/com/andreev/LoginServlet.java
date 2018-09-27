package com.andreev;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{

        String validationLogin = new String("vanosss");
        String validationPassword = new String("700648");

        Cookie cookies[] = req.getCookies();

        String loginFieldValue = new String("null");
        String passwordFieldValue = new String("null");;

        for(Cookie c : cookies){
            if(c.getName().equals("login")){
                loginFieldValue = c.getValue();
            }
            if(c.getName().equals("password")){
                passwordFieldValue = c.getValue();
            }
        }


        PrintWriter out = res.getWriter();
        if(validationLogin.equals(loginFieldValue) &&  validationPassword.equals(passwordFieldValue)){
            out.println("You are logged in");
        }
        else {
            out.println("Invalid login/password!!!");
        }
    }
}
