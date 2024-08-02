package generator;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_user_role
 */
@Data
public class SysUserRoleKey implements Serializable {
    private Long userId;

    private Long roleId;

    private static final long serialVersionUID = 1L;
}