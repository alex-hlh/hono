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
@TableName("sys_user_depart")
@ApiModel(value = "SysUserDepart对象", description = "")
public class SysUserDepart implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userId;

    private String depId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    @Override
    public String toString() {
        return "SysUserDepart{" +
            "id = " + id +
            ", userId = " + userId +
            ", depId = " + depId +
        "}";
    }
}
