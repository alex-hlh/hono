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
@TableName("sys_third_account")
@ApiModel(value = "SysThirdAccount对象", description = "")
public class SysThirdAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String sysUserId;

    private String thirdType;

    private String avatar;

    private Integer status;

    private Integer delFlag;

    private String realname;

    private String thirdUserUuid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(String sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getThirdType() {
        return thirdType;
    }

    public void setThirdType(String thirdType) {
        this.thirdType = thirdType;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getThirdUserUuid() {
        return thirdUserUuid;
    }

    public void setThirdUserUuid(String thirdUserUuid) {
        this.thirdUserUuid = thirdUserUuid;
    }

    @Override
    public String toString() {
        return "SysThirdAccount{" +
            "id = " + id +
            ", sysUserId = " + sysUserId +
            ", thirdType = " + thirdType +
            ", avatar = " + avatar +
            ", status = " + status +
            ", delFlag = " + delFlag +
            ", realname = " + realname +
            ", thirdUserUuid = " + thirdUserUuid +
        "}";
    }
}
