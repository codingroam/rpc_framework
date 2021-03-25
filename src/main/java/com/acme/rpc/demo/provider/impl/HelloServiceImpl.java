package com.acme.rpc.demo.provider.impl;

import com.acme.rpc.demo.framework.server.RpcStudyService;
import com.acme.rpc.demo.consumer.HelloService;

/**
 * @author: K.
 * @date: 2021/1/15 下午6:41
 */
@RpcStudyService(HelloService.class)
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String userName) {
        return "hello"+userName;
    }

    @Override
    public String qq() {
        return "qq";
    }

    @Override
    public String sayHello2(String userName) {
        return "lxl"+userName;
    }
}
