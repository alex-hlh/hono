package com.hu.hono.entity;

import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("qrtz_paused_trigger_grps")
@ApiModel(value = "QrtzPausedTriggerGrps对象", description = "")
public class QrtzPausedTriggerGrps implements Serializable {

    private static final long serialVersionUID = 1L;

    private String schedName;

    private String triggerGroup;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    @Override
    public String toString() {
        return "QrtzPausedTriggerGrps{" +
            "schedName = " + schedName +
            ", triggerGroup = " + triggerGroup +
        "}";
    }
}
