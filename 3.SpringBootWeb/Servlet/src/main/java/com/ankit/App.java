package com.ankit;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8081);

        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context,"HelloServlet1", new HelloServlet());
        context.addServletMappingDecoded("/hello", "HelloServlet1");

        tomcat.start();
        tomcat.getServer().await();

    }
}