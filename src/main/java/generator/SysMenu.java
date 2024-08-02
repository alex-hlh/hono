package generator;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * sys_menu
 */
@Data
public class SysMenu implements Serializable {
    private Long menuId;

    private String menuName;

    private Long parentId;

    private Integer orderNum;

    private String url;

    private String target;

    private String menuType;

    private String visible;

    private String isRefresh;

    private String perms;

    private String icon;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private String remark;

    private static final long serialVersionUID = 1L;
}