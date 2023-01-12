package com.hu.hono.server.service;

import com.hu.hono.server.enmu.EventType;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author hlh
 * @version v1.0
 * @title EventFactory
 * @projectName hono
 * @description
 * @date 2023/1/11 11:17
 */
@Component
public class EventFactory implements ApplicationContextAware, InitializingBean {
    private static final Map<EventType,IExcuteEvent> EVENT_TYPE_MAP= new EnumMap<EventType, IExcuteEvent>(EventType.class);
    private ApplicationContext applicationContext;

    public IExcuteEvent getEvent(EventType type){
        return EVENT_TYPE_MAP.get(type);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        applicationContext.getBeansOfType(IExcuteEvent.class).values()
                .forEach(event -> EVENT_TYPE_MAP.put(event.getEventType(),event));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
