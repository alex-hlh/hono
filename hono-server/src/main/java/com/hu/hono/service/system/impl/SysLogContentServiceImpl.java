package com.hu.hono.service.system.impl;

import com.hu.hono.entity.SysLogContent;
import com.hu.hono.mapper.SysLogContentMapper;
import com.hu.hono.service.system.ISysLogContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 日志大字段 服务实现类
 * </p>
 *
 * @author hono
 * @since 2024-08-01
 */
@Service
public class SysLogContentServiceImpl extends ServiceImpl<SysLogContentMapper, SysLogContent> implements ISysLogContentService {

}
