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
@TableName("hik_user_info")
@ApiModel(value = "HikUserInfo对象", description = "")
public class HikUserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userId;

    private String userAccount;

    private String hikUserAccount;

    private String hikUserPwd;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getHikUserAccount() {
        return hikUserAccount;
    }

    public void setHikUserAccount(String hikUserAccount) {
        this.hikUserAccount = hikUserAccount;
    }

    public String getHikUserPwd() {
        return hikUserPwd;
    }

    public void setHikUserPwd(String hikUserPwd) {
        this.hikUserPwd = hikUserPwd;
    }

    @Override
    public String toString() {
        return "HikUserInfo{" +
            "userId = " + userId +
            ", userAccount = " + userAccount +
            ", hikUserAccount = " + hikUserAccount +
            ", hikUserPwd = " + hikUserPwd +
        "}";
    }
}
