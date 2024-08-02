package com.hu.hono.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * (SysLogService)表实体类
 *
 * @author @wangchen
 * @since 2021-09-03 16:29:04
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysLogApi extends Model<SysLogApi> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据主键
     */
    private String id;

    /**
     * 动态表名
     */
    @TableField(exist = false)
    private String tableName;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * ip地址
     */
    private String ip;

    /**
     * 请求地址
     */
    private String requestUrl;

    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 请求结果状态
     */
    private String result;

    /**
     * 操作类型
     */
    private String operateType;

    /**
     * 来源应用appId
     */
    private String originApp;

    /**
     * 目标服务appId
     */
    private String targetService;

    /**
     * 目标应用appId
     */
    private String targetApp;

    /**
     * 转发实际请求地址
     */
    private String driectAddr;

    /**
     * 请求方式
     */
    private String requestType;

    /**
     * 三元数据类型
     */
    private String threeType;

    /**
     * 请求参数
     */
    private String requestParameter;

    /**
     * 响应参数
     */
    private String responseMessage;

    /**
     * 请求耗时
     */
    private String costTime;

    /**
     * 结果描述
     */
    private String resultName;
}
