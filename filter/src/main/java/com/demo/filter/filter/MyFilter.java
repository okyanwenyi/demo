package com.demo.filter.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 基于注解的Filter，核心为@WebFilter注解。@Order是设置这个filter的执行顺序，值越小，越优先。
 * 需要在Application中添加注解@ServletComponentScan
 */

@WebFilter(urlPatterns="/getmsg")
@Order(1)
public class MyFilter implements Filter{
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
