package com.hu.hono.server.filter;

import cn.hutool.core.util.StrUtil;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hlh
 * @version v1.0
 * @title ContentCachingFilter
 * @projectName hono
 * @description
 * @date 2023/1/31 9:49
 */
@Order(1)
@WebFilter(urlPatterns = "/*")
public class ContentCachingFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // 不能拦截 application/x-www-form-urlencoded 和 multipart/form-data请求，否则会出现参数丢失，因为都是是http body中的 它们2个只能从流读取一次，后面解析的时候会出现问题。
        if (StrUtil.contains(request.getContentType(), MediaType.APPLICATION_JSON_VALUE)) {
            CachedBodyHttpServletRequestWrapper cachedBodyHttpServletRequest = new CachedBodyHttpServletRequestWrapper(request);
            filterChain.doFilter(cachedBodyHttpServletRequest, response);
        } else {
            filterChain.doFilter(request, response);
        }
    }
}
