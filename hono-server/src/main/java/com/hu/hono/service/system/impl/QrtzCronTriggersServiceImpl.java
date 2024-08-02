package com.hu.hono.service.system.impl;

import com.hu.hono.entity.QrtzCronTriggers;
import com.hu.hono.mapper.QrtzCronTriggersMapper;
import com.hu.hono.service.system.IQrtzCronTriggersService;
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
public class QrtzCronTriggersServiceImpl extends ServiceImpl<QrtzCronTriggersMapper, QrtzCronTriggers> implements IQrtzCronTriggersService {

}
