package com.hu.hono.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("sys_open_service")
@ApiModel(value = "SysOpenService对象", description = "")
public class SysOpenService implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SERVICE_ID", type = IdType.AUTO)
    private Integer serviceId;

    private Integer parentServiceId;

    private String serviceName;

    private String serviceCode;

    private String serviceUrl;

    private String appId;

    private String remoteUrl;

    private Integer status;

    private String requestMethod;

    private String contentType;

    private Integer concurrent;

    private Integer isSign;

    private Integer isLogin;

    private String thirdHandler;

    private String extend;

    private String responseCode;

    private String responseMsg;

    private Integer tenantId;

    private Integer sortNo;

    private Integer isDel;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private Integer requestLog;

    private Integer responseLog;

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getParentServiceId() {
        return parentServiceId;
    }

    public void setParentServiceId(Integer parentServiceId) {
        this.parentServiceId = parentServiceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getRemoteUrl() {
        return remoteUrl;
    }

    public void setRemoteUrl(String remoteUrl) {
        this.remoteUrl = remoteUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Integer getConcurrent() {
        return concurrent;
    }

    public void setConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
    }

    public Integer getIsSign() {
        return isSign;
    }

    public void setIsSign(Integer isSign) {
        this.isSign = isSign;
    }

    public Integer getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(Integer isLogin) {
        this.isLogin = isLogin;
    }

    public String getThirdHandler() {
        return thirdHandler;
    }

    public void setThirdHandler(String thirdHandler) {
        this.thirdHandler = thirdHandler;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
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

    public Integer getRequestLog() {
        return requestLog;
    }

    public void setRequestLog(Integer requestLog) {
        this.requestLog = requestLog;
    }

    public Integer getResponseLog() {
        return responseLog;
    }

    public void setResponseLog(Integer responseLog) {
        this.responseLog = responseLog;
    }

    @Override
    public String toString() {
        return "SysOpenService{" +
            "serviceId = " + serviceId +
            ", parentServiceId = " + parentServiceId +
            ", serviceName = " + serviceName +
            ", serviceCode = " + serviceCode +
            ", serviceUrl = " + serviceUrl +
            ", appId = " + appId +
            ", remoteUrl = " + remoteUrl +
            ", status = " + status +
            ", requestMethod = " + requestMethod +
            ", contentType = " + contentType +
            ", concurrent = " + concurrent +
            ", isSign = " + isSign +
            ", isLogin = " + isLogin +
            ", thirdHandler = " + thirdHandler +
            ", extend = " + extend +
            ", responseCode = " + responseCode +
            ", responseMsg = " + responseMsg +
            ", tenantId = " + tenantId +
            ", sortNo = " + sortNo +
            ", isDel = " + isDel +
            ", createBy = " + createBy +
            ", createTime = " + createTime +
            ", updateBy = " + updateBy +
            ", updateTime = " + updateTime +
            ", requestLog = " + requestLog +
            ", responseLog = " + responseLog +
        "}";
    }
}
