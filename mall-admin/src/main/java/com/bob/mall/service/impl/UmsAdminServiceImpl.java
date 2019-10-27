package com.bob.mall.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.bob.mall.mapper.UmsAdminMapper;
import com.bob.mall.model.UmsAdmin;
import com.bob.mall.model.UmsAdminExample;
import com.bob.mall.service.UmsAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 后台管理员服务实现
 *
 * @author yangfubo
 */
@Service("umsAdminService")
public class UmsAdminServiceImpl implements UmsAdminService {

    @Autowired
    private UmsAdminMapper umsAdminMapper;

    private static final Logger log = LoggerFactory.getLogger(UmsAdminServiceImpl.class);

    @Override
    public UmsAdmin getByUsername(String username) {
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsAdmin> umsAdminList = umsAdminMapper.selectByExample(example);
        if (CollectionUtil.isEmpty(umsAdminList)){
            return null;
        }
        return umsAdminList.get(0);
    }
}
