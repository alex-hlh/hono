package com.hu.hono.server.filter;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hlh
 * @version v1.0
 * @title CorsFilter
 * @projectName hono
 * @description
 * @date 2023/1/31 9:49
 */
@Order(0)
@WebFilter(urlPatterns = "/*")
public class CorsFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "*");
        if (HttpMethod.OPTIONS.toString().equals(request.getMethod())) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
