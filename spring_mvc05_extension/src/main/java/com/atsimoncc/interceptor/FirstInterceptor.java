package com.atsimoncc.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName: FirstInterceptor
 * Package: com.atsimoncc.interceptor
 * Description:
 */
@Component
public class FirstInterceptor implements HandlerInterceptor {
    // 控制器方法執行之前執行的
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("FirstInterceptor --> preHandle");
        return true;
    }

    // 控制器方法執行之後執行的
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("FirstInterceptor --> postHandle");
    }

    // 渲染完視圖之後執行的
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("FirstInterceptor --> afterCompletion");
    }
}
