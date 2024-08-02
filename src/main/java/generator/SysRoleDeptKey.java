package generator;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_role_dept
 */
@Data
public class SysRoleDeptKey implements Serializable {
    private Long roleId;

    private Long deptId;

    private static final long serialVersionUID = 1L;
}