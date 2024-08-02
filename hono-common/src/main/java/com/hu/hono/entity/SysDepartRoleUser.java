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
@TableName("sys_depart_role_user")
@ApiModel(value = "SysDepartRoleUser对象", description = "")
public class SysDepartRoleUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userId;

    private String droleId;

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

    public String getDroleId() {
        return droleId;
    }

    public void setDroleId(String droleId) {
        this.droleId = droleId;
    }

    @Override
    public String toString() {
        return "SysDepartRoleUser{" +
            "id = " + id +
            ", userId = " + userId +
            ", droleId = " + droleId +
        "}";
    }
}
