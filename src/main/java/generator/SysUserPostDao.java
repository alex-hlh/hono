package generator;

import generator.SysUserPostKey;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserPostDao {
    int deleteByPrimaryKey(SysUserPostKey key);

    int insert(SysUserPostKey record);

    int insertSelective(SysUserPostKey record);
}