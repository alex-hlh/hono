package com.hu.hono.entity;

import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("sys_app_info")
@ApiModel(value = "SysAppInfo对象", description = "")
public class SysAppInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("APP_ID")
    private String appId;

    private String dataSecret;

    private String signSecret;

    private String appName;

    private String orgName;

    private String name;

    private String phone;

    private Integer status;

    private String encType;

    private Integer dataEnc;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Integer concurrent;

    private String serverUrl;

    private Integer tenantId;

    private LocalDateTime secretUpdateTime;

    private Integer sortNo;

    private Integer isDel;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private String appCode;

    private String remoteLoginUrl;

    private Integer appType;

    private String docCenterHandler;

    private String docCenterNotifyUrl;

    private Integer accessTokenSurvival;

    private Integer refreshTokenSurvival;

    private Integer isMobileApp;

    private String whiteIp;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getDataSecret() {
        return dataSecret;
    }

    public void setDataSecret(String dataSecret) {
        this.dataSecret = dataSecret;
    }

    public String getSignSecret() {
        return signSecret;
    }

    public void setSignSecret(String signSecret) {
        this.signSecret = signSecret;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEncType() {
        return encType;
    }

    public void setEncType(String encType) {
        this.encType = encType;
    }

    public Integer getDataEnc() {
        return dataEnc;
    }

    public void setDataEnc(Integer dataEnc) {
        this.dataEnc = dataEnc;
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

    public Integer getConcurrent() {
        return concurrent;
    }

    public void setConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public LocalDateTime getSecretUpdateTime() {
        return secretUpdateTime;
    }

    public void setSecretUpdateTime(LocalDateTime secretUpdateTime) {
        this.secretUpdateTime = secretUpdateTime;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getRemoteLoginUrl() {
        return remoteLoginUrl;
    }

    public void setRemoteLoginUrl(String remoteLoginUrl) {
        this.remoteLoginUrl = remoteLoginUrl;
    }

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public String getDocCenterHandler() {
        return docCenterHandler;
    }

    public void setDocCenterHandler(String docCenterHandler) {
        this.docCenterHandler = docCenterHandler;
    }

    public String getDocCenterNotifyUrl() {
        return docCenterNotifyUrl;
    }

    public void setDocCenterNotifyUrl(String docCenterNotifyUrl) {
        this.docCenterNotifyUrl = docCenterNotifyUrl;
    }

    public Integer getAccessTokenSurvival() {
        return accessTokenSurvival;
    }

    public void setAccessTokenSurvival(Integer accessTokenSurvival) {
        this.accessTokenSurvival = accessTokenSurvival;
    }

    public Integer getRefreshTokenSurvival() {
        return refreshTokenSurvival;
    }

    public void setRefreshTokenSurvival(Integer refreshTokenSurvival) {
        this.refreshTokenSurvival = refreshTokenSurvival;
    }

    public Integer getIsMobileApp() {
        return isMobileApp;
    }

    public void setIsMobileApp(Integer isMobileApp) {
        this.isMobileApp = isMobileApp;
    }

    public String getWhiteIp() {
        return whiteIp;
    }

    public void setWhiteIp(String whiteIp) {
        this.whiteIp = whiteIp;
    }

    @Override
    public String toString() {
        return "SysAppInfo{" +
            "appId = " + appId +
            ", dataSecret = " + dataSecret +
            ", signSecret = " + signSecret +
            ", appName = " + appName +
            ", orgName = " + orgName +
            ", name = " + name +
            ", phone = " + phone +
            ", status = " + status +
            ", encType = " + encType +
            ", dataEnc = " + dataEnc +
            ", startTime = " + startTime +
            ", endTime = " + endTime +
            ", concurrent = " + concurrent +
            ", serverUrl = " + serverUrl +
            ", tenantId = " + tenantId +
            ", secretUpdateTime = " + secretUpdateTime +
            ", sortNo = " + sortNo +
            ", isDel = " + isDel +
            ", createBy = " + createBy +
            ", createTime = " + createTime +
            ", updateBy = " + updateBy +
            ", updateTime = " + updateTime +
            ", appCode = " + appCode +
            ", remoteLoginUrl = " + remoteLoginUrl +
            ", appType = " + appType +
            ", docCenterHandler = " + docCenterHandler +
            ", docCenterNotifyUrl = " + docCenterNotifyUrl +
            ", accessTokenSurvival = " + accessTokenSurvival +
            ", refreshTokenSurvival = " + refreshTokenSurvival +
            ", isMobileApp = " + isMobileApp +
            ", whiteIp = " + whiteIp +
        "}";
    }
}
