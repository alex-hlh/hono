package com.hu.hono.server.controller;

import cn.hutool.json.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/add")
    public String test(){
        Flow flow = new Flow();
        flow.setId("1");
        flow.setName("hlh");
        mongoTemplate.save(flow);
        Query query = new Query(Criteria.where("id").is("1"));
        Flow one = mongoTemplate.findOne(query, Flow.class);
        return JSONUtil.toJsonStr(one);
    }
}
