package com.hu.hono.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.sql.Blob;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 日志大字段
 * </p>
 *
 * @author hono
 * @since 2024-08-01
 */
@TableName("sys_log_content")
@ApiModel(value = "SysLogContent对象", description = "日志大字段")
public class SysLogContent implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private Blob requestParameter;

    private Blob responseMessage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Blob getRequestParameter() {
        return requestParameter;
    }

    public void setRequestParameter(Blob requestParameter) {
        this.requestParameter = requestParameter;
    }

    public Blob getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(Blob responseMessage) {
        this.responseMessage = responseMessage;
    }

    @Override
    public String toString() {
        return "SysLogContent{" +
            "id = " + id +
            ", requestParameter = " + requestParameter +
            ", responseMessage = " + responseMessage +
        "}";
    }
}
