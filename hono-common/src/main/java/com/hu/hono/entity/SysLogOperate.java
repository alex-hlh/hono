package com.hu.hono.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * (SysLogOperate)表实体类
 *
 * @author @wangchen
 * @since 2021-09-03 16:25:10
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class SysLogOperate extends Model<SysLogOperate> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
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
     * 结果描述
     */
    private String result;

    /**
     * 操作类型
     */
    private String operateType;

    /**
     * 来源应用
     */
    private String originApp;

    /**
     * 请求方式
     */
    private String requestType;

    /**
     * 三元数据类型
     */
    private String threeType;

    /**
     * 来源系统
     */
    private String originSystem;

    /**
     * 来源模块
     */
    private String originMoudule;

    /**
     * 结果的中文描述
     */
    private String resultName;

    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 请求耗时
     */
    private String costTime;
}
