package generator;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * sys_oper_log
 */
@Data
public class SysOperLog implements Serializable {
    private Long operId;

    private String title;

    private Integer businessType;

    private String method;

    private String requestMethod;

    private Integer operatorType;

    private String operName;

    private String deptName;

    private String operUrl;

    private String operIp;

    private String operLocation;

    private String operParam;

    private String jsonResult;

    private Integer status;

    private String errorMsg;

    private LocalDateTime operTime;

    private static final long serialVersionUID = 1L;
}