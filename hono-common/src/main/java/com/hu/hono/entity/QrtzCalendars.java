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
@TableName("qrtz_calendars")
@ApiModel(value = "QrtzCalendars对象", description = "")
public class QrtzCalendars implements Serializable {

    private static final long serialVersionUID = 1L;

    private String schedName;

    private String calendarName;

    private Blob calendar;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    public Blob getCalendar() {
        return calendar;
    }

    public void setCalendar(Blob calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return "QrtzCalendars{" +
            "schedName = " + schedName +
            ", calendarName = " + calendarName +
            ", calendar = " + calendar +
        "}";
    }
}
