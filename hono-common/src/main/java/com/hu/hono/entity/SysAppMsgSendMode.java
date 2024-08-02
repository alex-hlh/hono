package com.hu.hono.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author hono
 * @since 2024-08-01
 */
@TableName("sys_app_msg_send_mode")
@ApiModel(value = "SysAppMsgSendMode对象", description = "")
public class SysAppMsgSendMode implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String sendMode;

    private Integer status;

    private Integer delFlag;

    private Integer retryTimes;

    private LocalDateTime createTime;

    private String sendModeName;

    private LocalDateTime updateTime;

    private String className;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSendMode() {
        return sendMode;
    }

    public void setSendMode(String sendMode) {
        this.sendMode = sendMode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getSendModeName() {
        return sendModeName;
    }

    public void setSendModeName(String sendModeName) {
        this.sendModeName = sendModeName;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "SysAppMsgSendMode{" +
            "id = " + id +
            ", sendMode = " + sendMode +
            ", status = " + status +
            ", delFlag = " + delFlag +
            ", retryTimes = " + retryTimes +
            ", createTime = " + createTime +
            ", sendModeName = " + sendModeName +
            ", updateTime = " + updateTime +
            ", className = " + className +
        "}";
    }
}
