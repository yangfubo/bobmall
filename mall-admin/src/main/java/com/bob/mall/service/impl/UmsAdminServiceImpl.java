package com.bob.mall.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.bob.mall.mapper.UmsAdminMapper;
import com.bob.mall.model.UmsAdmin;
import com.bob.mall.model.UmsAdminExample;
import com.bob.mall.model.UmsPermission;
import com.bob.mall.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 管理员接口服务实现
 *
 * @author yangfubo
 */
@Service("umsAdminService")
public class UmsAdminServiceImpl implements UmsAdminService {

    @Autowired
    private UmsAdminMapper umsAdminMapper;



    @Override
    public UmsAdmin getByUsername(String username) {
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsAdmin> umsAdminList = umsAdminMapper.selectByExample(example);
        if (CollectionUtil.isEmpty(umsAdminList)){
            return new UmsAdmin();
        }
        return umsAdminList.get(0);
    }

    @Override
    public UmsAdmin getById(Long id) {
        return umsAdminMapper.selectByPrimaryKey(id);
    }

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     *
     * @param adminId
     */
    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {
        // @TODO 待完成
        return null;
    }
}
