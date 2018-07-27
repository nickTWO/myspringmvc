package com.hyt.backend.common;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpServlet;

/**
 * @author Echo_ayalamih
 * @description desc.
 * @packagename com.paycloudx.backend.common
 * @date 17:07, 22/11/2017
 */
public class ApplicationListener extends HttpServlet implements ServletContextListener {
    /**
     * Default constructor.
     */
    public ApplicationListener() {
    }

    /**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    @Override
    public void contextInitialized(ServletContextEvent event) {
        String basePath = event.getServletContext().getRealPath("/");
//        System.setProperty("base.path", basePath);
        System.setProperty("logs.path", basePath + "/WEB-INF/logs");

        ServletContext application = event.getServletContext();
        WebApplicationContext cxt = WebApplicationContextUtils.getWebApplicationContext(application);
//        PayCloudConstants.applicationContext = cxt;
//        PayCloudConstants.sc = application;

        System.out.println("#########################################################################################");
        System.out.println("#####     Application Starting...");
        System.out.println("#########################################################################################");
//        ActiveMQContext.deliverMessage("hello");
    }

    /**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("#########################################################################################");
        System.out.println("#####     Application Server endding...");
        System.out.println("#########################################################################################");
    }

    @Override
    public void init() {
        System.out.println("#########################################################################################");
        System.out.println("#####     Application Server Init Start...");
        System.out.println("#########################################################################################");
    }

}
