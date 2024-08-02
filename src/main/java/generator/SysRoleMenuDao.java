package generator;

import generator.SysRoleMenuKey;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleMenuDao {
    int deleteByPrimaryKey(SysRoleMenuKey key);

    int insert(SysRoleMenuKey record);

    int insertSelective(SysRoleMenuKey record);
}