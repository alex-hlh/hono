package com.hu.hono.server.controller;

import com.hu.hono.common.result.CommonResult;
import com.hu.hono.server.service.ISysUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户信息表;(sys_user)表控制层
 * @author : http://www.chiner.pro
 * @date : 2023-8-24
 */
@Api(tags = "用户信息表对象功能接口")
@RestController
@RequestMapping("/user")
public class SysUserController{

	@Autowired
	private ISysUserService sysUserService;

	@PostMapping("/login")
	public CommonResult login(){
		return CommonResult.success();
	}

}
