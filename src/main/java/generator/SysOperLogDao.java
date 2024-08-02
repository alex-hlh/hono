package generator;

import generator.SysOperLog;
import org.springframework.stereotype.Repository;

@Repository
public interface SysOperLogDao {
    int deleteByPrimaryKey(Long operId);

    int insert(SysOperLog record);

    int insertSelective(SysOperLog record);

    SysOperLog selectByPrimaryKey(Long operId);

    int updateByPrimaryKeySelective(SysOperLog record);

    int updateByPrimaryKey(SysOperLog record);
}