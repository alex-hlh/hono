package com.hu.hono.event;

import com.hu.hono.enmu.EventType;

/**
 * @author hlh
 * @version v1.0
 * @title IExcuteEvent
 * @projectName hono
 * @description
 * @date 2023/1/11 11:31
 */
public interface IExcuteEvent {

    EventType getEventType();

    void process();

}
