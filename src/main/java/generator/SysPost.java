package generator;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * sys_post
 */
@Data
public class SysPost implements Serializable {
    private Long postId;

    private String postCode;

    private String postName;

    private Integer postSort;

    private String status;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private String remark;

    private static final long serialVersionUID = 1L;
}