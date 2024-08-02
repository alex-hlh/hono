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
@TableName("sys_user_agent")
@ApiModel(value = "SysUserAgent对象", description = "")
public class SysUserAgent implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userName;

    private String agentUserName;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private String status;

    private String createName;

    private String createBy;

    private LocalDateTime createTime;

    private String updateName;

    private String updateBy;

    private LocalDateTime updateTime;

    private String sysOrgCode;

    private String sysCompanyCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAgentUserName() {
        return agentUserName;
    }

    public void setAgentUserName(String agentUserName) {
        this.agentUserName = agentUserName;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
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

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
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

    public String getSysOrgCode() {
        return sysOrgCode;
    }

    public void setSysOrgCode(String sysOrgCode) {
        this.sysOrgCode = sysOrgCode;
    }

    public String getSysCompanyCode() {
        return sysCompanyCode;
    }

    public void setSysCompanyCode(String sysCompanyCode) {
        this.sysCompanyCode = sysCompanyCode;
    }

    @Override
    public String toString() {
        return "SysUserAgent{" +
            "id = " + id +
            ", userName = " + userName +
            ", agentUserName = " + agentUserName +
            ", startTime = " + startTime +
            ", endTime = " + endTime +
            ", status = " + status +
            ", createName = " + createName +
            ", createBy = " + createBy +
            ", createTime = " + createTime +
            ", updateName = " + updateName +
            ", updateBy = " + updateBy +
            ", updateTime = " + updateTime +
            ", sysOrgCode = " + sysOrgCode +
            ", sysCompanyCode = " + sysCompanyCode +
        "}";
    }
}
