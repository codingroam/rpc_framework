package com.acme.rpc.demo.consumer.web;

import com.acme.rpc.demo.framework.client.requestlimit.RateLimitPolicy;
import com.acme.rpc.demo.framework.client.requestlimit.RequestLimit;
import com.acme.rpc.demo.consumer.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: K.
 * @date: 2021/1/20 下午3:34
 */
@RestController
public class TestController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/t1")
    public String get() {
            return helloService.qq();
    }

    @GetMapping("/t2")
    @RequestLimit(mode = RateLimitPolicy.COUNT_RATE_LIMITER
    )
    public String get2() {
            return helloService.sayHello("hi");
    }

    @GetMapping("/t3")
    @RequestLimit(mode = RateLimitPolicy.TOKEN_BUCKET_LIMITER)
    public String get3() {
            return helloService.sayHello2("hi");
    }
}
