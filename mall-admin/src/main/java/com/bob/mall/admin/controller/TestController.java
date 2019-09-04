package com.bob.mall.admin.controller;

import com.bob.mall.admin.model.UmsAdmin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "TestController")
@RestController
@RequestMapping(path = "/test")
public class TestController {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @ApiOperation("hello world测试")
    @GetMapping(path = "sayHello")
    public String sayHello(String someone){
        redisTemplate.opsForValue().set("hello", "helloWorld");
        return redisTemplate.opsForValue().get("hello");
    }

    @ApiOperation("返回参数测试")
    @GetMapping(path = "/admin")
    public UmsAdmin getAdmin(){
        UmsAdmin admin= new UmsAdmin();
        admin.setNickName("杨先生");
        admin.setId((long)1);
        return admin;
    }
}
