package com.atsimoncc.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * ClassName: WebInit
 * Package: com.atsimoncc.config
 * Description:
 */
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    // 設定一個配置類別來代替 Spring 的配置文件
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    // 設定一個配置類別來代替 SpringMVC 的設定文件
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    // 設定 SpringMVC 的前端控制器 DispatcherServlet 的 url-pattern
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    // 設定當前的過濾器
    protected Filter[] getServletFilters() {
        // 建立編碼過濾器
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        // 建立處理請求方式的過濾器
        HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
        return new Filter[]{characterEncodingFilter, hiddenHttpMethodFilter};
    }
}
