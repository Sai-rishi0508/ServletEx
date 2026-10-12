package com.rishi;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("in service");

        //here we are specifying what content we want to represnt in browser
        res.setContentType("text/html");

        //this line is responsible for sending a msg or data back to client
        //the below line is one way for achieving it

        //res.getWriter().println("Hello World");

        //the below line is another way for achieving sending data back to client
        PrintWriter out=res.getWriter();

        //here this line just writes the thing we want into the response object
        //as our msg will be reflecting in an html page we can use html tags here while defining the value
        out.println("<h2><b>hello world</b><h2>");


    }

}
