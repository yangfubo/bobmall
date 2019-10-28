package com.bob.mall.service;

import com.bob.mall.mapper.UmsAdminMapper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.util.Assert;

import java.util.ArrayList;
@ActiveProfiles("sit")
public class UmsAdminServiceTest extends BaseTest {

    @Autowired
    private UmsAdminService umsAdminService;


    @Before
    public void mockInit(){
        MockitoAnnotations.initMocks(this.getClass());
    }

    @Test
    public void getByUsernameTest(){
        Assert.notNull(umsAdminService.getByUsername("admin"), "根据用户名获取管理员信息失败");
    }
}
