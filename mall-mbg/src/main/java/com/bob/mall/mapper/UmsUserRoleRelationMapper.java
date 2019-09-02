package com.bob.mall.mapper;

import com.bob.mall.model.UmsUserRoleRelation;
import com.bob.mall.model.UmsUserRoleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsUserRoleRelationMapper {
    long countByExample(UmsUserRoleRelationExample example);

    int deleteByExample(UmsUserRoleRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsUserRoleRelation record);

    int insertSelective(UmsUserRoleRelation record);

    List<UmsUserRoleRelation> selectByExample(UmsUserRoleRelationExample example);

    UmsUserRoleRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsUserRoleRelation record, @Param("example") UmsUserRoleRelationExample example);

    int updateByExample(@Param("record") UmsUserRoleRelation record, @Param("example") UmsUserRoleRelationExample example);

    int updateByPrimaryKeySelective(UmsUserRoleRelation record);

    int updateByPrimaryKey(UmsUserRoleRelation record);
}