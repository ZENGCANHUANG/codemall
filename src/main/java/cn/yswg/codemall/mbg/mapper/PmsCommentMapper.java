package cn.yswg.codemall.mbg.mapper;

import cn.yswg.codemall.mbg.model.PmsComment;
import cn.yswg.codemall.mbg.model.PmsCommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsCommentMapper {
    int countByExample(PmsCommentExample example);

    int deleteByExample(PmsCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsComment record);

    int insertSelective(PmsComment record);

    List<PmsComment> selectByExampleWithBLOBs(PmsCommentExample example);

    List<PmsComment> selectByExample(PmsCommentExample example);

    PmsComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    int updateByExample(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    int updateByPrimaryKeySelective(PmsComment record);

    int updateByPrimaryKeyWithBLOBs(PmsComment record);

    int updateByPrimaryKey(PmsComment record);
}