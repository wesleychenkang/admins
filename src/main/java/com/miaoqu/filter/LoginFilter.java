package com.miaoqu.filter;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by wesley on 2018/12/17.
 * 登录过滤器
 */

@Component
@WebFilter(filterName = "loginfilter", urlPatterns = "/admin/*")
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.print("filter init =================================================================");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter doFilter========");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        System.out.println("request" + request.getRequestURI());
        HttpSession session = request.getSession();
        filterChain.doFilter(request, servletResponse);
        System.out.println("doFilter doFilter r");
    }

    @Override
    public void destroy() {

    }
}
