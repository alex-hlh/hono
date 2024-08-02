package com.hu.hono.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @Description: gateway路由管理
 * @Author: yozo-boot
 * @Date: 2020-05-26
 * @Version: V1.0
 */
@Data
@TableName("sys_gateway_route")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class SysGatewayRoute implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    /**
     * routerKEy
     */
    private String routerId;

    /**
     * 服务名
     */
    private String name;

    /**
     * 服务地址
     */
    private String uri;

    /**
     * 断言配置
     */
    private String predicates;

    /**
     * 过滤配置
     */
    private String filters;

    /**
     * 是否忽略前缀0-否 1-是
     */
    private Integer stripPrefix;

    /**
     * 是否重试0-否 1-是
     */
    private Integer retryable;

    /**
     * 是否为保留数据:0-否 1-是
     */
    private Integer persistable;

    /**
     * 是否在接口文档中展示:0-否 1-是
     */
    private Integer showApi;

    /**
     * 状态 1有效 0无效
     */
    private Integer status;

    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
