package com.hu.hono.server.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hu.hono.common.entity.SysUser;

public interface ISysUserService extends IService<SysUser> {
	Page<SysUser> paginQuery(SysUser sysUser, long current, long size);

	SysUser insert(SysUser sysUser);

	SysUser update(SysUser sysUser);

	boolean deleteById(Long userId);
}
