package com.acme.rpc.demo.consumer;

import com.acme.rpc.demo.framework.ProxyFactory;

/**
 * @author: K.
 * @date: 2021/1/15 下午7:17
 */
@Deprecated
public class Comsumer {
    public static void main(String[] args) {
        HelloService helloService = ProxyFactory.getProxy(HelloService.class);
//        String result = helloService.qq();
//        System.out.println(result);

    }
}
