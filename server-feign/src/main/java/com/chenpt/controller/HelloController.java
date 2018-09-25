package com.chenpt.controller;

import com.chenpt.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:
 * 作者: chen_pt
 * 创建日期: 2018/5/25
 * 修改记录:
 */
@RestController
@RequestMapping("feginHello")
public class HelloController {


    @Autowired
    SchedualServiceHi schedualServiceHi;



    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(){
        return schedualServiceHi.sayHiFromClientOne();
    }

}
