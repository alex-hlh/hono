package generator;

import generator.SysPost;
import org.springframework.stereotype.Repository;

@Repository
public interface SysPostDao {
    int deleteByPrimaryKey(Long postId);

    int insert(SysPost record);

    int insertSelective(SysPost record);

    SysPost selectByPrimaryKey(Long postId);

    int updateByPrimaryKeySelective(SysPost record);

    int updateByPrimaryKey(SysPost record);
}