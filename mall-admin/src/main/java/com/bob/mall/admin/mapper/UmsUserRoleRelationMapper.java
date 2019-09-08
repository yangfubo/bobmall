package com.bob.mall.admin.mapper;

import com.bob.mall.admin.model.UmsUserRoleRelation;
import com.bob.mall.admin.model.UmsUserRoleRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* Created by Mybatis Generator on 2019/09/08
*/
public interface UmsUserRoleRelationMapper {
    long countByExample(UmsUserRoleRelationExample example);

    int deleteByExample(UmsUserRoleRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsUserRoleRelation record);

    int insertSelective(UmsUserRoleRelation record);

    List<UmsUserRoleRelation> selectByExample(UmsUserRoleRelationExample example);

    UmsUserRoleRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsUserRoleRelation record, @Param("example") UmsUserRoleRelationExample example);

    int updateByExample(@Param("record") UmsUserRoleRelation record, @Param("example") UmsUserRoleRelationExample example);

    int updateByPrimaryKeySelective(UmsUserRoleRelation record);

    int updateByPrimaryKey(UmsUserRoleRelation record);
}