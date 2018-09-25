package com.chenpt.controller;

import com.chenpt.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:
 * 作者: chen_pt
 * 创建日期: 2018/5/25
 * 修改记录:
 */
@Controller
@RequestMapping("helloRibbon")
public class HelloController {


    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public @ResponseBody String hi(){
        return helloService.hiService();
    }

}
