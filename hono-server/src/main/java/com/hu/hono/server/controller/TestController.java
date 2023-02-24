package com.hu.hono.server.controller;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.json.JSONUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

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

//    @PostMapping("/getUser")
//    public String getUser(@RequestBody LinkParam param) {
//        List<User> userList = new ArrayList<>();
//        User user1 = new User("1532252308073664513", "章晓阳");
//        User user2 = new User("1532290509345705986", "陆游");
//        User user3 = new User("1532290534377312258", "谢冰");
//        User user4 = new User("1536175558113652737", "胡立华");
//        User user5 = new User("1538775746960736257", "毕波");
//        User user6 = new User("1539489803047825409", "冯起山");
//        User user7 = new User("1547852006062870529", "邹磊");
//        User user8 = new User("1548849981522235394", "李萍");
//        User user9 = new User("1549236962597068801", "雷洲洋");
//        userList.add(user1);
//        userList.add(user2);
//        userList.add(user3);
//        userList.add(user4);
//        userList.add(user5);
//        userList.add(user6);
//        userList.add(user7);
//        userList.add(user8);
//        userList.add(user9);
//        int i = RandomUtil.randomInt(0, 8);
//        User u1 = userList.get(RandomUtil.randomInt(0, 8));
//        User u2 = userList.get(RandomUtil.randomInt(0, 8));
//        List<User> result = new ArrayList<>();
//        result.add(u1);
//        result.add(u2);
//        return JSONUtil.toJsonStr(result);
//    }

    @GetMapping("/all")
    public String all() {
        List<User> all = userRepository.findAll();
        return JSONUtil.toJsonStr(all);
    }

}
