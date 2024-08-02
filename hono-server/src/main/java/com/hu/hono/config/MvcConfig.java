package com.hu.hono.config;

import cn.hutool.core.collection.CollUtil;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.support.config.FastJsonConfig;
import com.alibaba.fastjson2.support.spring.http.converter.FastJsonHttpMessageConverter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

/**
 * web相关配置
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Autowired(required = false)
    private List<HandlerInterceptor> interceptorList;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        if (CollUtil.isEmpty(interceptorList)) {
            return;
        }
        interceptorList.forEach(e -> {
            registry.addInterceptor(e).addPathPatterns("/**");
        });
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/preview/**");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/druidMonitor").setViewName("redirect:druid/index.html");
        registry.addViewController("/swaggerApi").setViewName("redirect:swagger-ui.html");
    }

    /**
     * @param converters:
     * @Description : FastJsonConfig 配置器
     * @Author : zxy
     * @Date : 2022/5/13 11:22
     * @return: void
     **/
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(fastJsonHttpMessageConverter());
    }

    /**
     * @Description : FastJsonConfig  序列化配置
     * @Author : zxy
     * @Date : 2023/4/21 11:31
     * @return: com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter
     **/
    @Bean
    public FastJsonHttpMessageConverter fastJsonHttpMessageConverter() {
        FastJsonHttpMessageConverter fastJsonConverter = new FastJsonHttpMessageConverter();

        List<MediaType> supportedMediaTypes = new ArrayList<>();
        supportedMediaTypes.add(MediaType.APPLICATION_JSON);
        supportedMediaTypes.add(MediaType.APPLICATION_ATOM_XML);
        supportedMediaTypes.add(MediaType.APPLICATION_FORM_URLENCODED);
        supportedMediaTypes.add(MediaType.APPLICATION_OCTET_STREAM);
        supportedMediaTypes.add(MediaType.APPLICATION_PDF);
        supportedMediaTypes.add(MediaType.APPLICATION_RSS_XML);
        supportedMediaTypes.add(MediaType.APPLICATION_XHTML_XML);
        supportedMediaTypes.add(MediaType.APPLICATION_XML);
        supportedMediaTypes.add(MediaType.IMAGE_GIF);
        supportedMediaTypes.add(MediaType.IMAGE_JPEG);
        supportedMediaTypes.add(MediaType.IMAGE_PNG);
        supportedMediaTypes.add(MediaType.TEXT_EVENT_STREAM);
        supportedMediaTypes.add(MediaType.TEXT_HTML);
        supportedMediaTypes.add(MediaType.TEXT_MARKDOWN);
        supportedMediaTypes.add(MediaType.TEXT_PLAIN);
        supportedMediaTypes.add(MediaType.TEXT_XML);
        fastJsonConverter.setSupportedMediaTypes(supportedMediaTypes);
        FastJsonConfig fjc = new FastJsonConfig();
        // 配置输出时间的格式
        fjc.setDateFormat("yyyy-MM-dd HH:mm:ss");
        fjc.setWriteContentLength(false);
        fjc.setWriterFeatures(
            JSONWriter.Feature.WriteNullListAsEmpty,
            //json格式化
            JSONWriter.Feature.PrettyFormat,
            //输出map中value为null的数据
            JSONWriter.Feature.WriteMapNullValue,
            //输出boolean 为 false
            JSONWriter.Feature.WriteNullBooleanAsFalse,
            //输出list 为 []
            JSONWriter.Feature.WriteNullListAsEmpty,
            //输出number 为 0
            JSONWriter.Feature.WriteNullNumberAsZero,
            //输出字符串 为 ""
            JSONWriter.Feature.WriteNullStringAsEmpty,
            //对map进行排序
            JSONWriter.Feature.MapSortField
        );
        fastJsonConverter.setFastJsonConfig(fjc);
        return fastJsonConverter;
    }

    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
        localeResolver.setDefaultLocale(Locale.SIMPLIFIED_CHINESE);
        return localeResolver;
    }
}
