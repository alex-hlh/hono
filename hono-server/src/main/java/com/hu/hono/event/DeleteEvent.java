package com.hu.hono.event;

import com.hu.hono.enmu.EventType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hlh
 * @version v1.0
 * @title DeleteEvent
 * @projectName hono
 * @description
 * @date 2023/1/11 14:01
 */
public class DeleteEvent extends AbstractEvent {
    private Logger logger = LoggerFactory.getLogger(DeleteEvent.class);

    public DeleteEvent(Object data) {
        super(data);
    }

    @Override
    public EventType getEventType() {
        return EventType.DELETE;
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
