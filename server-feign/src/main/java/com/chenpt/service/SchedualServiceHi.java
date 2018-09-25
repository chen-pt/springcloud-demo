package com.chenpt.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 版权所有(C) 2018
 * 描述: Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。
 * 使用Feign，只需要创建一个接口并注解。它具有可插拔的注解特性，
 * 可使用Feign 注解和JAX-RS注解。Feign支持可插拔的编码器和解码器。
 * Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
 *
 * 作者: chen_pt
 * 创建日期: 2018/5/25
 * 修改记录:
 */
@FeignClient(value = "hello-server",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {


    @RequestMapping(value = "/hello/home",method = RequestMethod.GET)
    String sayHiFromClientOne();





}
