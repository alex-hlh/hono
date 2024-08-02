package com.hu.hono.service.system.impl;

import com.hu.hono.entity.QrtzLocks;
import com.hu.hono.mapper.QrtzLocksMapper;
import com.hu.hono.service.system.IQrtzLocksService;
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
public class QrtzLocksServiceImpl extends ServiceImpl<QrtzLocksMapper, QrtzLocks> implements IQrtzLocksService {

}
