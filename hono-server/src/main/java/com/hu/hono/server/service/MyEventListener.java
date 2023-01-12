package com.hu.hono.server.service;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author hlh
 * @version v1.0
 * @title MyEventListener
 * @projectName hono
 * @description
 * @date 2023/1/11 14:13
 */
@Component
public class MyEventListener implements ApplicationListener<AbstractEvent> {

    @Async
    @Override
    public void onApplicationEvent(AbstractEvent event) {
        event.process();
    }
}
