package generator;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_role_menu
 */
@Data
public class SysRoleMenuKey implements Serializable {
    private Long roleId;

    private Long menuId;

    private static final long serialVersionUID = 1L;
}