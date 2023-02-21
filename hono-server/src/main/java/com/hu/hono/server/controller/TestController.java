package com.hu.hono.server.controller;

import cn.hutool.json.JSONUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/add")
    public String test() {
        List<User> userList = new ArrayList<>();
        User user1 = new User(1L, "user1", "1231", 12);
        User user2 = new User(2L, "user2", "1232", 13);
        User user3 = new User(3L, "user3", "1233", 14);
        User user4 = new User(4L, "user4", "1234", 15);
        User user5 = new User(5L, "user5", "1235", 16);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userRepository.saveAll(userList);
        return "success";
    }

    @GetMapping("/all")
    public String all() {
        List<User> all = userRepository.findAll();
        return JSONUtil.toJsonStr(all);
    }

}
