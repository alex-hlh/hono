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
@TableName("sys_app_msg_info")
@ApiModel(value = "SysAppMsgInfo对象", description = "")
public class SysAppMsgInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String appId;

    private LocalDateTime storeTime;

    private LocalDateTime receiveTime;

    private String msgBody;

    private String sender;

    private String sendMode;

    private Integer delFlag;

    private String receiveUser;

    private String serialNumber;

    private Integer status;

    private Integer yetRetryTimes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public LocalDateTime getStoreTime() {
        return storeTime;
    }

    public void setStoreTime(LocalDateTime storeTime) {
        this.storeTime = storeTime;
    }

    public LocalDateTime getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(LocalDateTime receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSendMode() {
        return sendMode;
    }

    public void setSendMode(String sendMode) {
        this.sendMode = sendMode;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getReceiveUser() {
        return receiveUser;
    }

    public void setReceiveUser(String receiveUser) {
        this.receiveUser = receiveUser;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getYetRetryTimes() {
        return yetRetryTimes;
    }

    public void setYetRetryTimes(Integer yetRetryTimes) {
        this.yetRetryTimes = yetRetryTimes;
    }

    @Override
    public String toString() {
        return "SysAppMsgInfo{" +
            "id = " + id +
            ", appId = " + appId +
            ", storeTime = " + storeTime +
            ", receiveTime = " + receiveTime +
            ", msgBody = " + msgBody +
            ", sender = " + sender +
            ", sendMode = " + sendMode +
            ", delFlag = " + delFlag +
            ", receiveUser = " + receiveUser +
            ", serialNumber = " + serialNumber +
            ", status = " + status +
            ", yetRetryTimes = " + yetRetryTimes +
        "}";
    }
}
