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
@TableName("ot_template_datebase")
@ApiModel(value = "OtTemplateDatebase对象", description = "")
public class OtTemplateDatebase implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String templateId;

    private LocalDateTime createdTime;

    private String tableName;

    private String isHaveChild;

    private String parenTable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getIsHaveChild() {
        return isHaveChild;
    }

    public void setIsHaveChild(String isHaveChild) {
        this.isHaveChild = isHaveChild;
    }

    public String getParenTable() {
        return parenTable;
    }

    public void setParenTable(String parenTable) {
        this.parenTable = parenTable;
    }

    @Override
    public String toString() {
        return "OtTemplateDatebase{" +
            "id = " + id +
            ", templateId = " + templateId +
            ", createdTime = " + createdTime +
            ", tableName = " + tableName +
            ", isHaveChild = " + isHaveChild +
            ", parenTable = " + parenTable +
        "}";
    }
}
