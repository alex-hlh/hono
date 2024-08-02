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
@TableName("sys_role_permission")
@ApiModel(value = "SysRolePermission对象", description = "")
public class SysRolePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String roleId;

    private String permissionId;

    private String dataRuleIds;

    private LocalDateTime operateDate;

    private String operateIp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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

    public LocalDateTime getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(LocalDateTime operateDate) {
        this.operateDate = operateDate;
    }

    public String getOperateIp() {
        return operateIp;
    }

    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp;
    }

    @Override
    public String toString() {
        return "SysRolePermission{" +
            "id = " + id +
            ", roleId = " + roleId +
            ", permissionId = " + permissionId +
            ", dataRuleIds = " + dataRuleIds +
            ", operateDate = " + operateDate +
            ", operateIp = " + operateIp +
        "}";
    }
}
