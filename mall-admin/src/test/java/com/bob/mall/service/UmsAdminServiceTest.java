package com.bob.mall.service;

import com.bob.mall.model.UmsAdmin;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.util.Assert;


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
        UmsAdmin umsAdmin = umsAdminService.getByUsername("admin");
        Assert.notNull(umsAdmin, "根据用户名获取管理员信息失败");
    }
}
