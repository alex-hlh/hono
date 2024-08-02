package com.hu.hono.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("ot_depart_permission")
@ApiModel(value = "OtDepartPermission对象", description = "")
public class OtDepartPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String departId;

    private String templateId;

    private String subclassId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getSubclassId() {
        return subclassId;
    }

    public void setSubclassId(String subclassId) {
        this.subclassId = subclassId;
    }

    @Override
    public String toString() {
        return "OtDepartPermission{" +
            "id = " + id +
            ", departId = " + departId +
            ", templateId = " + templateId +
            ", subclassId = " + subclassId +
        "}";
    }
}
