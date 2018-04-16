package com.demo.filter.config;

import com.demo.filter.filter.MyFilterNoAnnotation;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public FilterRegistrationBean testFilterRegistration() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilterNoAnnotation());
        registration.addUrlPatterns("/getmsg");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("noAnnotionFilter");
        registration.setOrder(2);
        return registration;
    }
}
