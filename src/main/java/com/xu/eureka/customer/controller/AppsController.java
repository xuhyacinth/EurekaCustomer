package com.xu.eureka.customer.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xu.eureka.customer.service.AppsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hyacinth
 * @since 2021-06-14
 */
@Api(tags = "App api 详情")
@EnableHystrix
@RestController
@RequestMapping("/customer/apps")
public class AppsController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private AppsService appsService;

    @ApiParam(name = "pageNum", required = true, value = "起始条数")
    @ApiOperation(value = "App查询", notes = "获取所有的App")
    @RequestMapping(value = "/getAllAppsInfo")
    @HystrixCommand(fallbackMethod = "getAllAppsInfoError")
    public Object getAllAppsInfo(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize) {
        return appsService.getAllAppsInfo(pageNum, pageSize);
    }

    public Map<String, Object> getAllAppsInfoError(Integer pageNum, Integer pageSize) throws InterruptedException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 500);
        map.put("info", "系统【" + port + "】繁忙，稍后重试");
        return map;
    }

}

