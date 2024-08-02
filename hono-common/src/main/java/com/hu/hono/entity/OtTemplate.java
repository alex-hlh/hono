package com.hu.hono.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
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
@TableName("ot_template")
@ApiModel(value = "OtTemplate对象", description = "")
public class OtTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String tempalteId;

    private String tempalteName;

    private String tempalteType;

    private String subclassId;

    private String storageAddress;

    private String storageMode;

    private String analysisAddr;

    private String analysisAddrStyle;

    private String classid;

    private Integer version;

    private String tempalteStatus;

    private String identityId;

    private String departId;

    private String departName;

    private String createdId;

    private String createName;

    private LocalDateTime createdTime;

    private String updatedBy;

    private LocalDate updatedTime;

    private String ip;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTempalteId() {
        return tempalteId;
    }

    public void setTempalteId(String tempalteId) {
        this.tempalteId = tempalteId;
    }

    public String getTempalteName() {
        return tempalteName;
    }

    public void setTempalteName(String tempalteName) {
        this.tempalteName = tempalteName;
    }

    public String getTempalteType() {
        return tempalteType;
    }

    public void setTempalteType(String tempalteType) {
        this.tempalteType = tempalteType;
    }

    public String getSubclassId() {
        return subclassId;
    }

    public void setSubclassId(String subclassId) {
        this.subclassId = subclassId;
    }

    public String getStorageAddress() {
        return storageAddress;
    }

    public void setStorageAddress(String storageAddress) {
        this.storageAddress = storageAddress;
    }

    public String getStorageMode() {
        return storageMode;
    }

    public void setStorageMode(String storageMode) {
        this.storageMode = storageMode;
    }

    public String getAnalysisAddr() {
        return analysisAddr;
    }

    public void setAnalysisAddr(String analysisAddr) {
        this.analysisAddr = analysisAddr;
    }

    public String getAnalysisAddrStyle() {
        return analysisAddrStyle;
    }

    public void setAnalysisAddrStyle(String analysisAddrStyle) {
        this.analysisAddrStyle = analysisAddrStyle;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getTempalteStatus() {
        return tempalteStatus;
    }

    public void setTempalteStatus(String tempalteStatus) {
        this.tempalteStatus = tempalteStatus;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getCreatedId() {
        return createdId;
    }

    public void setCreatedId(String createdId) {
        this.createdId = createdId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDate getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDate updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "OtTemplate{" +
            "id = " + id +
            ", tempalteId = " + tempalteId +
            ", tempalteName = " + tempalteName +
            ", tempalteType = " + tempalteType +
            ", subclassId = " + subclassId +
            ", storageAddress = " + storageAddress +
            ", storageMode = " + storageMode +
            ", analysisAddr = " + analysisAddr +
            ", analysisAddrStyle = " + analysisAddrStyle +
            ", classid = " + classid +
            ", version = " + version +
            ", tempalteStatus = " + tempalteStatus +
            ", identityId = " + identityId +
            ", departId = " + departId +
            ", departName = " + departName +
            ", createdId = " + createdId +
            ", createName = " + createName +
            ", createdTime = " + createdTime +
            ", updatedBy = " + updatedBy +
            ", updatedTime = " + updatedTime +
            ", ip = " + ip +
        "}";
    }
}
