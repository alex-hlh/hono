package com.hu.hono.server.service;

import com.hu.hono.server.enmu.EventType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @author hlh
 * @version v1.0
 * @title SelectEvent
 * @projectName hono
 * @description
 * @date 2023/1/11 13:59
 */
public class SelectEvent extends AbstractEvent {
    private Logger logger = LoggerFactory.getLogger(SelectEvent.class);


    public SelectEvent(Object data) {
        super(data);
    }

    @Override
    public EventType getEventType() {
        return EventType.SELECT;
    }

    @Override
    public void process() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logger.info("================"+data+"====================");
    }
}
