package com.acme.rpc.demo.consumer;

import com.acme.rpc.demo.framework.client.RpcStudyClient;

/**
 * @author: K.
 * @date: 2021/1/15 下午6:41
 */
@RpcStudyClient(name="user",mode = RpcStudyClient.asyn)
public interface HelloService {
    String sayHello(String userName);
    String qq();
    String sayHello2(String userName);
}
