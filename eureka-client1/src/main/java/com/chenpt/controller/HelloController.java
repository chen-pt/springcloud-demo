package com.chenpt.controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.hypermedia.DiscoveredResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:
 * 作者: chen_pt
 * 创建日期: 2018/5/25
 * 修改记录:
 */
@Controller
@RequestMapping("hello")
public class HelloController {

//    @Resource
//    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;


    @RequestMapping("home")
    public @ResponseBody String home(){


        return "success--port"+port;
    }


}
