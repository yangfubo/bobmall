package com.bob.mall.controller;

import com.bob.mall.common.api.CommonResult;
import com.bob.mall.model.UmsAdmin;
import com.bob.mall.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "UmsAdminController", description = "后台用户管理" )
@RequestMapping("/api/admin")
public class UmsAdminController {

    private static final Logger log = LoggerFactory.getLogger(UmsAdminController.class);

    @Autowired
    private UmsAdminService umsAdminService;

    @ApiOperation(value = "根据id获取用户信息")
    @GetMapping(path = "/{id}")
    public CommonResult<UmsAdmin> getById(@PathVariable Long id){
        return CommonResult.success( umsAdminService.getById(id));
    }

}
