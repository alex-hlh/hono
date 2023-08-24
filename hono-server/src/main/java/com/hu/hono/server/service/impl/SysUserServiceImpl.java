package com.hu.hono.server.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hu.hono.common.entity.SysUser;
import com.hu.hono.common.mapper.SysUserMapper;
import com.hu.hono.server.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @projectName: hono
 * @package: com.hu.hono.server.service.impl
 * @className: SysUserServiceImpl
 * @author: hlh
 * @description: TODO
 * @date: 2023/8/24 14:28
 * @version: 1.0
 */
@Transactional(rollbackFor = Exception.class)
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;

	/**
	 * 分页查询
	 *
	 * @param sysUser 筛选条件
	 * @param current 当前页码
	 * @param size  每页大小
	 * @return
	 */
	@Override
	public Page<SysUser> paginQuery(SysUser sysUser, long current, long size){
		//1. 构建动态查询条件
		LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
		if(StrUtil.isNotBlank(sysUser.getLoginName())){
			queryWrapper.eq(SysUser::getLoginName, sysUser.getLoginName());
		}
		if(StrUtil.isNotBlank(sysUser.getUserName())){
			queryWrapper.eq(SysUser::getUserName, sysUser.getUserName());
		}
		if(StrUtil.isNotBlank(sysUser.getUserType())){
			queryWrapper.eq(SysUser::getUserType, sysUser.getUserType());
		}
		if(StrUtil.isNotBlank(sysUser.getEmail())){
			queryWrapper.eq(SysUser::getEmail, sysUser.getEmail());
		}
		if(StrUtil.isNotBlank(sysUser.getPhoneNumber())){
			queryWrapper.eq(SysUser::getPhoneNumber, sysUser.getPhoneNumber());
		}
		if(StrUtil.isNotBlank(sysUser.getAvatar())){
			queryWrapper.eq(SysUser::getAvatar, sysUser.getAvatar());
		}
		if(StrUtil.isNotBlank(sysUser.getPassword())){
			queryWrapper.eq(SysUser::getPassword, sysUser.getPassword());
		}
		if(StrUtil.isNotBlank(sysUser.getSalt())){
			queryWrapper.eq(SysUser::getSalt, sysUser.getSalt());
		}
		if(StrUtil.isNotBlank(sysUser.getLoginIp())){
			queryWrapper.eq(SysUser::getLoginIp, sysUser.getLoginIp());
		}
		if(StrUtil.isNotBlank(sysUser.getCreateBy())){
			queryWrapper.eq(SysUser::getCreateBy, sysUser.getCreateBy());
		}
		if(StrUtil.isNotBlank(sysUser.getUpdateBy())){
			queryWrapper.eq(SysUser::getUpdateBy, sysUser.getUpdateBy());
		}
		if(StrUtil.isNotBlank(sysUser.getRemark())){
			queryWrapper.eq(SysUser::getRemark, sysUser.getRemark());
		}
		//2. 执行分页查询
		Page<SysUser> pagin = new Page<>(current , size , true);
		IPage<SysUser> selectResult = sysUserMapper.selectByPage(pagin , queryWrapper);
		pagin.setPages(selectResult.getPages());
		pagin.setTotal(selectResult.getTotal());
		pagin.setRecords(selectResult.getRecords());
		//3. 返回结果
		return pagin;
	}

	/**
	 * 新增数据
	 *
	 * @param sysUser 实例对象
	 * @return 实例对象
	 */
	@Override
	public SysUser insert(SysUser sysUser){
		sysUserMapper.insert(sysUser);
		return sysUser;
	}

	/**
	 * 更新数据
	 *
	 * @param sysUser 实例对象
	 * @return 实例对象
	 */
	@Override
	public SysUser update(SysUser sysUser){
		//1. 根据条件动态更新
		LambdaUpdateChainWrapper<SysUser> chainWrapper = new LambdaUpdateChainWrapper<SysUser>(sysUserMapper);
		if(StrUtil.isNotBlank(sysUser.getLoginName())){
			chainWrapper.eq(SysUser::getLoginName, sysUser.getLoginName());
		}
		if(StrUtil.isNotBlank(sysUser.getUserName())){
			chainWrapper.eq(SysUser::getUserName, sysUser.getUserName());
		}
		if(StrUtil.isNotBlank(sysUser.getUserType())){
			chainWrapper.eq(SysUser::getUserType, sysUser.getUserType());
		}
		if(StrUtil.isNotBlank(sysUser.getEmail())){
			chainWrapper.eq(SysUser::getEmail, sysUser.getEmail());
		}
		if(StrUtil.isNotBlank(sysUser.getPhoneNumber())){
			chainWrapper.eq(SysUser::getPhoneNumber, sysUser.getPhoneNumber());
		}
		if(StrUtil.isNotBlank(sysUser.getAvatar())){
			chainWrapper.eq(SysUser::getAvatar, sysUser.getAvatar());
		}
		if(StrUtil.isNotBlank(sysUser.getPassword())){
			chainWrapper.eq(SysUser::getPassword, sysUser.getPassword());
		}
		if(StrUtil.isNotBlank(sysUser.getSalt())){
			chainWrapper.eq(SysUser::getSalt, sysUser.getSalt());
		}
		if(StrUtil.isNotBlank(sysUser.getLoginIp())){
			chainWrapper.eq(SysUser::getLoginIp, sysUser.getLoginIp());
		}
		if(StrUtil.isNotBlank(sysUser.getCreateBy())){
			chainWrapper.eq(SysUser::getCreateBy, sysUser.getCreateBy());
		}
		if(StrUtil.isNotBlank(sysUser.getUpdateBy())){
			chainWrapper.eq(SysUser::getUpdateBy, sysUser.getUpdateBy());
		}
		if(StrUtil.isNotBlank(sysUser.getRemark())){
			chainWrapper.eq(SysUser::getRemark, sysUser.getRemark());
		}
		//2. 设置主键，并更新
		chainWrapper.set(SysUser::getUserId, sysUser.getUserId());
		boolean ret = chainWrapper.update();
		//3. 更新成功了，查询最最对象返回
		if(ret){
			return getById(sysUser.getUserId());
		}else{
			return sysUser;
		}
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param userId 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Long userId){
		int total = sysUserMapper.deleteById(userId);
		return total > 0;
	}
}
