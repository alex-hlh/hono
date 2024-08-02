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
@TableName("sys_depart_permission")
@ApiModel(value = "SysDepartPermission对象", description = "")
public class SysDepartPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String departId;

    private String permissionId;

    private String dataRuleIds;

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

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getDataRuleIds() {
        return dataRuleIds;
    }

    public void setDataRuleIds(String dataRuleIds) {
        this.dataRuleIds = dataRuleIds;
    }

    @Override
    public String toString() {
        return "SysDepartPermission{" +
            "id = " + id +
            ", departId = " + departId +
            ", permissionId = " + permissionId +
            ", dataRuleIds = " + dataRuleIds +
        "}";
    }
}
