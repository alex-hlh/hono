package com.hu.hono.service.system.impl;

import com.hu.hono.entity.QrtzJobDetails;
import com.hu.hono.mapper.QrtzJobDetailsMapper;
import com.hu.hono.service.system.IQrtzJobDetailsService;
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
public class QrtzJobDetailsServiceImpl extends ServiceImpl<QrtzJobDetailsMapper, QrtzJobDetails> implements IQrtzJobDetailsService {

}
