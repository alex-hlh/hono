package generator;

import java.io.Serializable;
import lombok.Data;

/**
 * sys_user_post
 */
@Data
public class SysUserPostKey implements Serializable {
    private Long userId;

    private Long postId;

    private static final long serialVersionUID = 1L;
}