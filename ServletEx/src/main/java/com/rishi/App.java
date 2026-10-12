package com.rishi;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App
{
    public static void main( String[] args ) throws LifecycleException {
        Tomcat tomcat=new Tomcat();//tomcat object creation
        //tomcat.start();//to start a server
        //tomcat.getServer().await();//to tell tomcat to run without stopping

        //here we have created an http connector that listens on porrt:8080
        //we can also customise our portnumber
        tomcat.setPort(8080);
        tomcat.getConnector();

        //the below line is responsible for mapping a tomcat with a servlet
        Context context= tomcat.addContext("",null);

        //the below line helps us in mapping first we have to pass the name of our class then again create an object for it
        //here consider the both as parameters
        //this line helps in registering a servlet
        Tomcat.addServlet(context,"h1", new HelloServlet());

       //mapping URL to servlet
        context.addServletMappingDecoded("/hello", "h1");
        //after all these mappings now start the server

        //start Tomcat
        tomcat.start();

        //keep server running
        tomcat.getServer().await();



    }
}
