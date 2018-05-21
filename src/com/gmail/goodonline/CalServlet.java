package com.gmail.goodonline;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "CalServlet",urlPatterns = "/Calculate")
public class CalServlet extends javax.servlet.http.HttpServlet {

    public CalServlet() {
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String snumber1= request.getParameter("Number 1");
        String snumber2= request.getParameter("Number 2");
        String soption= request.getParameter("option");

        double dnumber1= Double.parseDouble(snumber1);
        double dnumber2= Double.parseDouble(snumber2);
        double result=0;

        if(soption.equals("+")){

            result=dnumber1+dnumber2;


        }else if(soption.equals("-")){

            result= dnumber1-dnumber2;
        }else if(soption.equals("*")){

            result=dnumber1*dnumber2;
        }else if(soption.equals("/")){

            result=dnumber1/dnumber2;
        }
        out.print("Result:<br>"+result);
    }



}
