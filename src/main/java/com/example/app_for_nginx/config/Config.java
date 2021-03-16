package com.example.app_for_nginx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;


public class Config {
    @Bean
    public DispatcherServlet dispatcherServlet () {
        DispatcherServlet ds = new DispatcherServlet();
        ds.setThrowExceptionIfNoHandlerFound(true);
        return ds;
    }
}
