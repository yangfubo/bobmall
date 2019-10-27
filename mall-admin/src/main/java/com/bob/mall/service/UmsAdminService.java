package com.bob.mall.service;

import com.bob.mall.model.UmsAdmin;

/**
 * 后台管理员服务接口
 *
 * @author yangfubo
 */
public interface UmsAdminService {
    UmsAdmin getByUsername(String username);
}
