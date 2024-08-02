package com.hu.hono.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysServiceCount {

        //来源应用
        private String originApp;
        //目标应用
        private String targetApp;
        //目标服务
        private String targetService;
        // 结果
        private String result;
        // 总数
        private String countSize;
}
