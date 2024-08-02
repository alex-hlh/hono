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
@TableName("ot_template_field")
@ApiModel(value = "OtTemplateField对象", description = "")
public class OtTemplateField implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String identityId;

    private String tempalteFieldCname;

    private String tempalteFieldEnname;

    private String tempalteFieldType;

    private String tempalteFieldLine;

    private String tempalteFileColumn;

    private String tableName;

    private String isSaveChild;

    private String tempalteFiledEndColumn;

    private String tempalteFiledEndLine;

    private String createdBy;

    private LocalDateTime createdTime;

    private String updatedBy;

    private LocalDateTime updatedTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public String getTempalteFieldCname() {
        return tempalteFieldCname;
    }

    public void setTempalteFieldCname(String tempalteFieldCname) {
        this.tempalteFieldCname = tempalteFieldCname;
    }

    public String getTempalteFieldEnname() {
        return tempalteFieldEnname;
    }

    public void setTempalteFieldEnname(String tempalteFieldEnname) {
        this.tempalteFieldEnname = tempalteFieldEnname;
    }

    public String getTempalteFieldType() {
        return tempalteFieldType;
    }

    public void setTempalteFieldType(String tempalteFieldType) {
        this.tempalteFieldType = tempalteFieldType;
    }

    public String getTempalteFieldLine() {
        return tempalteFieldLine;
    }

    public void setTempalteFieldLine(String tempalteFieldLine) {
        this.tempalteFieldLine = tempalteFieldLine;
    }

    public String getTempalteFileColumn() {
        return tempalteFileColumn;
    }

    public void setTempalteFileColumn(String tempalteFileColumn) {
        this.tempalteFileColumn = tempalteFileColumn;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getIsSaveChild() {
        return isSaveChild;
    }

    public void setIsSaveChild(String isSaveChild) {
        this.isSaveChild = isSaveChild;
    }

    public String getTempalteFiledEndColumn() {
        return tempalteFiledEndColumn;
    }

    public void setTempalteFiledEndColumn(String tempalteFiledEndColumn) {
        this.tempalteFiledEndColumn = tempalteFiledEndColumn;
    }

    public String getTempalteFiledEndLine() {
        return tempalteFiledEndLine;
    }

    public void setTempalteFiledEndLine(String tempalteFiledEndLine) {
        this.tempalteFiledEndLine = tempalteFiledEndLine;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return "OtTemplateField{" +
            "id = " + id +
            ", identityId = " + identityId +
            ", tempalteFieldCname = " + tempalteFieldCname +
            ", tempalteFieldEnname = " + tempalteFieldEnname +
            ", tempalteFieldType = " + tempalteFieldType +
            ", tempalteFieldLine = " + tempalteFieldLine +
            ", tempalteFileColumn = " + tempalteFileColumn +
            ", tableName = " + tableName +
            ", isSaveChild = " + isSaveChild +
            ", tempalteFiledEndColumn = " + tempalteFiledEndColumn +
            ", tempalteFiledEndLine = " + tempalteFiledEndLine +
            ", createdBy = " + createdBy +
            ", createdTime = " + createdTime +
            ", updatedBy = " + updatedBy +
            ", updatedTime = " + updatedTime +
        "}";
    }
}
