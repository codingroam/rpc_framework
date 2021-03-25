package com.acme.rpc.demo.framework;

import com.acme.rpc.demo.framework.protocol.netty.asyn.RpcFuture;
import com.acme.rpc.demo.framework.serialize.tranobject.RpcRequest;
import com.acme.rpc.demo.framework.serialize.tranobject.RpcResponse;

/**
 * @author K.
 * @Date 2021/1/15 23:12
 * 协议的接口
 */
public interface Protocol {

    //服务提供方启动的方法
    void start(URL url,String serviceName);

    //发送请求

    RpcResponse send(URL url, RpcRequest rpcRequest);


    RpcFuture sendFuture(int fetch, String serviceName, RpcRequest request);

}
