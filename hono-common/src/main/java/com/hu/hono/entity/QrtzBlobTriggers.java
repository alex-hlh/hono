package com.hu.hono.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.sql.Blob;
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
@TableName("qrtz_blob_triggers")
@ApiModel(value = "QrtzBlobTriggers对象", description = "")
public class QrtzBlobTriggers implements Serializable {

    private static final long serialVersionUID = 1L;

    private String schedName;

    private String triggerName;

    private String triggerGroup;

    private Blob blobData;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    public Blob getBlobData() {
        return blobData;
    }

    public void setBlobData(Blob blobData) {
        this.blobData = blobData;
    }

    @Override
    public String toString() {
        return "QrtzBlobTriggers{" +
            "schedName = " + schedName +
            ", triggerName = " + triggerName +
            ", triggerGroup = " + triggerGroup +
            ", blobData = " + blobData +
        "}";
    }
}
