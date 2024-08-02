package com.hu.hono.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author hono
 * @since 2024-08-01
 */
@TableName("qrtz_locks")
@ApiModel(value = "QrtzLocks对象", description = "")
public class QrtzLocks implements Serializable {

    private static final long serialVersionUID = 1L;

    private String schedName;

    private String lockName;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getLockName() {
        return lockName;
    }

    public void setLockName(String lockName) {
        this.lockName = lockName;
    }

    @Override
    public String toString() {
        return "QrtzLocks{" +
            "schedName = " + schedName +
            ", lockName = " + lockName +
        "}";
    }
}
