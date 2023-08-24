package com.hu.hono.server.controller;

import com.hu.hono.common.entity.SysUser;
import com.hu.hono.server.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	/**
	 * 通过ID查询单条数据
	 *
	 * @param userId 主键
	 * @return 实例对象
	 */
	@ApiOperation("通过ID查询单条数据")
	@GetMapping("{userid}")
	public ResponseEntity<SysUser> queryById(Long userId){
		return ResponseEntity.ok(sysUserService.getById(userId));
	}



	/**
	 * 新增数据
	 *
	 * @param sysUser 实例对象
	 * @return 实例对象
	 */
	@ApiOperation("新增数据")
	@PostMapping
	public ResponseEntity<SysUser> add(SysUser sysUser){
		return ResponseEntity.ok(sysUserService.insert(sysUser));
	}

	/**
	 * 更新数据
	 *
	 * @param sysUser 实例对象
	 * @return 实例对象
	 */
	@ApiOperation("更新数据")
	@PutMapping
	public ResponseEntity<SysUser> edit(SysUser sysUser){
		return ResponseEntity.ok(sysUserService.update(sysUser));
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param userId 主键
	 * @return 是否成功
	 */
	@ApiOperation("通过主键删除数据")
	@DeleteMapping
	public ResponseEntity<Boolean> deleteById(Long userId){
		return ResponseEntity.ok(sysUserService.deleteById(userId));
	}
}
