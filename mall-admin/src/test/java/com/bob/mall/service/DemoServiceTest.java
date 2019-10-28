package com.bob.mall.service;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ActiveProfiles;


@ActiveProfiles("dev")
public class DemoServiceTest extends BaseTest{

    private static final Logger log = LoggerFactory.getLogger(DemoServiceTest.class);

    @Test
    public void test(){
        log.info("test");
    }
}
