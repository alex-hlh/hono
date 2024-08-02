package com.hu.hono.service.system.impl;

import com.hu.hono.entity.QrtzTriggers;
import com.hu.hono.mapper.QrtzTriggersMapper;
import com.hu.hono.service.system.IQrtzTriggersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hono
 * @since 2024-08-01
 */
@Service
public class QrtzTriggersServiceImpl extends ServiceImpl<QrtzTriggersMapper, QrtzTriggers> implements IQrtzTriggersService {

}
