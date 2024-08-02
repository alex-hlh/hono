package com.hu.hono.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author hlh
 * @version v1.0
 * @title AbstractEvent
 * @projectName hono
 * @description
 * @date 2023/1/11 14:21
 */
public abstract class AbstractEvent extends ApplicationEvent implements IExcuteEvent {
    protected Object data;

    public AbstractEvent(Object data) {
        super(data);
        this.data = data;
    }
}
