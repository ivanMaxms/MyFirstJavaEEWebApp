package com.andreev;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{

        int k = 0;

        Cookie cookies[] = req.getCookies();

        for(Cookie c : cookies){
            if(c.getName().equals("k")){
                k = Integer.parseInt(c.getValue());
            }
        }


        k = k*k;

        PrintWriter out = res.getWriter();
        out.println("Square result is " + k);

        System.out.println("SqServlet was called");
    }
}
