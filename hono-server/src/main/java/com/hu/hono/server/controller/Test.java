package com.hu.hono.server.controller;

import com.hu.hono.common.util.IP2CityUtil;

import java.io.IOException;

/**
 * @author hlh
 * @version v1.0
 * @title Test
 * @projectName hono
 * @description
 * @date 2023/1/31 11:56
 */
public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println(IP2CityUtil.getCityInfo("203.119.241.114"));
    }
}
