package generator;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * sys_dict_type
 */
@Data
public class SysDictType implements Serializable {
    private Long dictId;

    private String dictName;

    private String dictType;

    private String status;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private String remark;

    private static final long serialVersionUID = 1L;
}