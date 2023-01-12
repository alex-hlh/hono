package com.hu.hono.server.controller;

import com.hu.hono.server.service.DeleteEvent;
import com.hu.hono.server.service.SaveEvent;
import com.hu.hono.server.service.SelectEvent;
import com.hu.hono.server.service.UpdateEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hlh
 * @version v1.0
 * @title TestController
 * @projectName hono
 * @description
 * @date 2022/11/9 16:37
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Resource
    private ApplicationEventPublisher publisher;

    @GetMapping("/add")
    public String test(){
        log.info("==================start==========================");
        publisher.publishEvent(new SaveEvent("save event"));
        publisher.publishEvent(new DeleteEvent("delete event"));
        publisher.publishEvent(new SelectEvent("select event"));
        publisher.publishEvent(new UpdateEvent("update event"));
        log.info("==================end==========================");
        return "success";
    }
}
