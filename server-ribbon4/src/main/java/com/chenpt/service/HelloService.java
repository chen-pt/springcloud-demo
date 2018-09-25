package com.chenpt.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 版权所有(C) 2017 上海银路投资管理有限公司
 * 描述:http://HELLO-SERVER/hello/home
 * 作者: chen_pt
 * 创建日期: 2018/5/25
 * 修改记录:
 */
@Service
public class HelloService {


    @Autowired
    RestTemplate restTemplate;//在springcloud中，引入Ribbon来作为客户端时，负载均衡使用的是被@LoadBalanced修饰的RestTemplate对象。

    //第一种方式
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService() {
        return restTemplate.getForObject("http://hello-server/hello/home",String.class);
    }

    /**
     * 第二种方式
     *
     * 返回ResponseEntity，该对象是Spring对HTTP请求响应的封装，
     * 其中主要存储了HTTP的几个重要元素，HttpStatus代表了错误码如404,500等。
     * 以及HttpHeaders代表了请求头，body代表了接收到的对象，其类型是根据第二个参数决定的。第一个url为请求地址，可以使用{1}占位符，而参数的值在该方法的最后的可变参数。
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService2() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("", String.class);
        return forEntity.getBody();
    }


    //熔断
    public String hiError() {
        return "hi,sorry,error!";
    }

}
