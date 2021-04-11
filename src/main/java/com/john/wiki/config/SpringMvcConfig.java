package com.john.wiki.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器
 *
 * @author constantinejohn
 */
@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {
//    @Resource
//    LogInterceptor logInterceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(logInterceptor)
//                .addPathPatterns("/**").excludePathPatterns("/login");
//    }
}
