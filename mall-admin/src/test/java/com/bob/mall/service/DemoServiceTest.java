package com.bob.mall.service;

import com.bob.mall.MallAdminApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


@ActiveProfiles("dev")
public class DemoServiceTest extends BaseTest{

    private static final Logger log = LoggerFactory.getLogger(DemoServiceTest.class);

    @Test
    public void test(){
        log.info("test");
    }
}
