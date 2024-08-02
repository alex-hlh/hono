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
@TableName("sys_sms")
@ApiModel(value = "SysSms对象", description = "")
public class SysSms implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String esTitle;

    private String esType;

    private String esReceiver;

    private String esParam;

    private String esContent;

    private LocalDateTime esSendTime;

    private String esSendStatus;

    private Integer esSendNum;

    private String esResult;

    private String remark;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEsTitle() {
        return esTitle;
    }

    public void setEsTitle(String esTitle) {
        this.esTitle = esTitle;
    }

    public String getEsType() {
        return esType;
    }

    public void setEsType(String esType) {
        this.esType = esType;
    }

    public String getEsReceiver() {
        return esReceiver;
    }

    public void setEsReceiver(String esReceiver) {
        this.esReceiver = esReceiver;
    }

    public String getEsParam() {
        return esParam;
    }

    public void setEsParam(String esParam) {
        this.esParam = esParam;
    }

    public String getEsContent() {
        return esContent;
    }

    public void setEsContent(String esContent) {
        this.esContent = esContent;
    }

    public LocalDateTime getEsSendTime() {
        return esSendTime;
    }

    public void setEsSendTime(LocalDateTime esSendTime) {
        this.esSendTime = esSendTime;
    }

    public String getEsSendStatus() {
        return esSendStatus;
    }

    public void setEsSendStatus(String esSendStatus) {
        this.esSendStatus = esSendStatus;
    }

    public Integer getEsSendNum() {
        return esSendNum;
    }

    public void setEsSendNum(Integer esSendNum) {
        this.esSendNum = esSendNum;
    }

    public String getEsResult() {
        return esResult;
    }

    public void setEsResult(String esResult) {
        this.esResult = esResult;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SysSms{" +
            "id = " + id +
            ", esTitle = " + esTitle +
            ", esType = " + esType +
            ", esReceiver = " + esReceiver +
            ", esParam = " + esParam +
            ", esContent = " + esContent +
            ", esSendTime = " + esSendTime +
            ", esSendStatus = " + esSendStatus +
            ", esSendNum = " + esSendNum +
            ", esResult = " + esResult +
            ", remark = " + remark +
            ", createBy = " + createBy +
            ", createTime = " + createTime +
            ", updateBy = " + updateBy +
            ", updateTime = " + updateTime +
        "}";
    }
}
