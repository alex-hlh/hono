package com.hu.hono.service.system.impl;

import com.hu.hono.entity.QrtzFiredTriggers;
import com.hu.hono.mapper.QrtzFiredTriggersMapper;
import com.hu.hono.service.system.IQrtzFiredTriggersService;
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
public class QrtzFiredTriggersServiceImpl extends ServiceImpl<QrtzFiredTriggersMapper, QrtzFiredTriggers> implements IQrtzFiredTriggersService {

}
