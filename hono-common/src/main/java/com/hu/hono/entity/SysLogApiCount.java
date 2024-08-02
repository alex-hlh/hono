package com.hu.hono.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 服务日志统计(SysLogServiceCount)表实体类
 *
 * @author makejava
 * @since 2021-09-15 09:15:41
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class SysLogApiCount extends Model<SysLogApiCount> {
    /**
     * ID
     */
    private String id;

    /**
     * 来源应用
     */
    private String originApp;

    /**
     * 目标应用
     */
    private String targetApp;

    /**
     * 目标服务
     */
    private String targetService;

    /**
     * 总数
     */
    private String successCount;

    /**
     * 正确 还是错误
     */
    private String errorCount;

    /**
     * 对应统计数据的时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 年
     */
    private String insertYear;

    /**
     * 月
     */
    private String insertMonth;

    /**
     * 日
     */
    private String insertDay;

    /**
     * 时
     */
    private String insertHour;
}
