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
@TableName("sys_app_msg_auth")
@ApiModel(value = "SysAppMsgAuth对象", description = "")
public class SysAppMsgAuth implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String appId;

    private String sendModeId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSendModeId() {
        return sendModeId;
    }

    public void setSendModeId(String sendModeId) {
        this.sendModeId = sendModeId;
    }

    @Override
    public String toString() {
        return "SysAppMsgAuth{" +
            "id = " + id +
            ", appId = " + appId +
            ", sendModeId = " + sendModeId +
        "}";
    }
}
