package com.hu.hono.server.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.convert.CustomConversions;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.core.convert.DbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;


/**
 * @author hlh
 * @version v1.0
 * @title MongoMappingConfig
 * @projectName hono
 * @description
 * @date 2023/2/21 11:10
 */
@Configuration
@Slf4j
public class MongoConfig {

    @Bean
    public SimpleMongoClientDatabaseFactory getFactory() {
        return new SimpleMongoClientDatabaseFactory("mongodb://192.168.40.253:27017/hono");
    }

    @Bean
    public MappingMongoConverter mappingMongoConverter(SimpleMongoClientDatabaseFactory factory,
                                                       MongoMappingContext context, BeanFactory beanFactory) {
        DbRefResolver dbRefResolver = new DefaultDbRefResolver(factory);
        MappingMongoConverter converter = new MappingMongoConverter(dbRefResolver, context);
        try {
            converter.setCustomConversions(beanFactory.getBean(CustomConversions.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //don't save column _class to mongo collection
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));
        return converter;
    }

}
