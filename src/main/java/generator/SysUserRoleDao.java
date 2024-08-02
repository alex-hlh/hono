package generator;

import generator.SysUserRoleKey;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRoleDao {
    int deleteByPrimaryKey(SysUserRoleKey key);

    int insert(SysUserRoleKey record);

    int insertSelective(SysUserRoleKey record);
}