package com.haoxy.friends.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * Created by haoxy on 2018/7/30.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Configuration
public class Config extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedHeaders("*")
                .allowedMethods("*")
                .allowedOrigins("*")
                .allowCredentials(true);
    }
    /** 解决跨域问题 **/
//    public void addCorsMappings(CorsRegistry registry) {}

    /** 添加拦截器 **/
//    void addInterceptors(InterceptorRegistry registry);

    /** 这里配置视图解析器 **/
//    void configureViewResolvers(ViewResolverRegistry registry);

    /** 配置内容裁决的一些选项 **/
//    void configureContentNegotiation(ContentNegotiationConfigurer configurer);

    /** 视图跳转控制器 **/
//    void addViewControllers(ViewControllerRegistry registry);

    /** 静态资源处理 **/
//    void addResourceHandlers(ResourceHandlerRegistry registry);

    /** 默认静态资源处理器 **/
//    void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer);


}