package com.hu.hono.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
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
@TableName("ot_template_upload")
@ApiModel(value = "OtTemplateUpload对象", description = "")
public class OtTemplateUpload implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String subclassId;

    private String templateId;

    private String templateName;

    private String templateVersion;

    private String fileId;

    private String fileName;

    private String depaetId;

    private String departName;

    private String createdId;

    private String createdName;

    private String uploadOrder;

    private String isSelf;

    private String replaceNo;

    private String replaceName;

    private String storageAddress;

    private String storageType;

    private String tableId;

    private String tableDataId;

    private String isDel;

    private LocalDate delTime;

    private String delBy;

    private String ispush;

    private String updatedBy;

    private LocalDate updatedTime;

    private LocalDate createdTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubclassId() {
        return subclassId;
    }

    public void setSubclassId(String subclassId) {
        this.subclassId = subclassId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateVersion() {
        return templateVersion;
    }

    public void setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDepaetId() {
        return depaetId;
    }

    public void setDepaetId(String depaetId) {
        this.depaetId = depaetId;
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

    public String getCreatedName() {
        return createdName;
    }

    public void setCreatedName(String createdName) {
        this.createdName = createdName;
    }

    public String getUploadOrder() {
        return uploadOrder;
    }

    public void setUploadOrder(String uploadOrder) {
        this.uploadOrder = uploadOrder;
    }

    public String getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(String isSelf) {
        this.isSelf = isSelf;
    }

    public String getReplaceNo() {
        return replaceNo;
    }

    public void setReplaceNo(String replaceNo) {
        this.replaceNo = replaceNo;
    }

    public String getReplaceName() {
        return replaceName;
    }

    public void setReplaceName(String replaceName) {
        this.replaceName = replaceName;
    }

    public String getStorageAddress() {
        return storageAddress;
    }

    public void setStorageAddress(String storageAddress) {
        this.storageAddress = storageAddress;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getTableDataId() {
        return tableDataId;
    }

    public void setTableDataId(String tableDataId) {
        this.tableDataId = tableDataId;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public LocalDate getDelTime() {
        return delTime;
    }

    public void setDelTime(LocalDate delTime) {
        this.delTime = delTime;
    }

    public String getDelBy() {
        return delBy;
    }

    public void setDelBy(String delBy) {
        this.delBy = delBy;
    }

    public String getIspush() {
        return ispush;
    }

    public void setIspush(String ispush) {
        this.ispush = ispush;
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

    public LocalDate getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDate createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "OtTemplateUpload{" +
            "id = " + id +
            ", subclassId = " + subclassId +
            ", templateId = " + templateId +
            ", templateName = " + templateName +
            ", templateVersion = " + templateVersion +
            ", fileId = " + fileId +
            ", fileName = " + fileName +
            ", depaetId = " + depaetId +
            ", departName = " + departName +
            ", createdId = " + createdId +
            ", createdName = " + createdName +
            ", uploadOrder = " + uploadOrder +
            ", isSelf = " + isSelf +
            ", replaceNo = " + replaceNo +
            ", replaceName = " + replaceName +
            ", storageAddress = " + storageAddress +
            ", storageType = " + storageType +
            ", tableId = " + tableId +
            ", tableDataId = " + tableDataId +
            ", isDel = " + isDel +
            ", delTime = " + delTime +
            ", delBy = " + delBy +
            ", ispush = " + ispush +
            ", updatedBy = " + updatedBy +
            ", updatedTime = " + updatedTime +
            ", createdTime = " + createdTime +
        "}";
    }
}
