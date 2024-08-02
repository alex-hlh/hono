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
@TableName("sys_app_msg_send_info")
@ApiModel(value = "SysAppMsgSendInfo对象", description = "")
public class SysAppMsgSendInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String messageId;

    private LocalDateTime sendTime;

    private String sendMode;

    private String status;

    private Integer sendResult;

    private Integer retryTime;

    private String sendModeId;

    private String receiveUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    public String getSendMode() {
        return sendMode;
    }

    public void setSendMode(String sendMode) {
        this.sendMode = sendMode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSendResult() {
        return sendResult;
    }

    public void setSendResult(Integer sendResult) {
        this.sendResult = sendResult;
    }

    public Integer getRetryTime() {
        return retryTime;
    }

    public void setRetryTime(Integer retryTime) {
        this.retryTime = retryTime;
    }

    public String getSendModeId() {
        return sendModeId;
    }

    public void setSendModeId(String sendModeId) {
        this.sendModeId = sendModeId;
    }

    public String getReceiveUser() {
        return receiveUser;
    }

    public void setReceiveUser(String receiveUser) {
        this.receiveUser = receiveUser;
    }

    @Override
    public String toString() {
        return "SysAppMsgSendInfo{" +
            "id = " + id +
            ", messageId = " + messageId +
            ", sendTime = " + sendTime +
            ", sendMode = " + sendMode +
            ", status = " + status +
            ", sendResult = " + sendResult +
            ", retryTime = " + retryTime +
            ", sendModeId = " + sendModeId +
            ", receiveUser = " + receiveUser +
        "}";
    }
}
