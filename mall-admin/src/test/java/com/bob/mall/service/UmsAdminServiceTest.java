package com.bob.mall.service;

import com.bob.mall.mapper.UmsAdminMapper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

import java.util.ArrayList;

public class UmsAdminServiceTest extends BaseTest {

    @Autowired
    private UmsAdminService umsAdminService;

    @MockBean
    private UmsAdminMapper umsAdminMapper;

    @Before
    public void mockInit(){
        MockitoAnnotations.initMocks(this.getClass());
    }

    @Test
    public void getByUsernameTest(){
        Mockito.when(umsAdminMapper.selectByExample(Mockito.any())).thenReturn(new ArrayList<>());
        Assert.notNull(umsAdminService.getByUsername("admin"), "根据用户名获取管理员信息失败");
    }
}
