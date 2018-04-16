package com.demo.filter.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 基于非注解模式的Filter，需要在Configuration中增加一个@Bean注解的方法。
 */

public class MyFilterNoAnnotation implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(this.getClass().getName()+" init filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(this.getClass().getName()+" do filter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println(this.getClass().getName()+" destroy filter");
    }
}
