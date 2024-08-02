package generator;

import generator.SysRoleDeptKey;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleDeptDao {
    int deleteByPrimaryKey(SysRoleDeptKey key);

    int insert(SysRoleDeptKey record);

    int insertSelective(SysRoleDeptKey record);
}