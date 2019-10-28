package com.bob.mall.service;

import com.bob.mall.model.UmsAdmin;
import com.bob.mall.model.UmsPermission;

import java.util.List;

/**
 * 后台用户接口
 *
 * @author yangfubo
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取用户
     */
    UmsAdmin getByUsername(String username);

    /**
     * 根据id获取用户
     */
    UmsAdmin getById(Long id);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);
}
