package com.hu.hono.server.service;

import com.hu.hono.server.enmu.EventType;

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
