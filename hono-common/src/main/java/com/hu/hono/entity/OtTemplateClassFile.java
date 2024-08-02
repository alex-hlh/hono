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
@TableName("ot_template_class_file")
@ApiModel(value = "OtTemplateClassFile对象", description = "")
public class OtTemplateClassFile implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String templateId;

    private String classid;

    private String subclassId;

    private String fileId;

    private LocalDate createdTime;

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

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getSubclassId() {
        return subclassId;
    }

    public void setSubclassId(String subclassId) {
        this.subclassId = subclassId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public LocalDate getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDate createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "OtTemplateClassFile{" +
            "id = " + id +
            ", templateId = " + templateId +
            ", classid = " + classid +
            ", subclassId = " + subclassId +
            ", fileId = " + fileId +
            ", createdTime = " + createdTime +
        "}";
    }
}
