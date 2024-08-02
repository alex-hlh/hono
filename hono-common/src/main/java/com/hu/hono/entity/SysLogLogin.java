package com.hu.hono.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * (SysLogLogin)表实体类
 *
 * @author @wangchen
 * @since 2021-09-03 15:57:05
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysLogLogin extends Model<SysLogLogin> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 数据表名
     */
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
     * 结果描述
     */
    private String result;

    /**
     * 日志类型
     */
    private String logType;

    /**
     * 错误原因
     */
    private String failReason;

    /**
     * 来源应用
     */
    private String originApp;

    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 三元数据类型
     */
    private String threeType;

    /**
     * 目标应用
     */
    private String targetApp;

//    private String resultName;

    /**
     * 请求地址
     */
    private String requestUrl;
}
