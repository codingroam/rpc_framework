package com.acme.rpc.demo.framework.protocol.netty;

import com.acme.rpc.demo.framework.connect.ConnectManager;
import com.acme.rpc.demo.framework.protocol.netty.asyn.NettyAsynHandler;
import com.acme.rpc.demo.framework.protocol.netty.asyn.RpcFuture;
import com.acme.rpc.demo.framework.serialize.tranobject.RpcRequest;
import com.acme.rpc.demo.framework.serialize.tranobject.RpcResponse;
import com.acme.rpc.demo.framework.server.RpcStudyRegister;
import com.acme.rpc.demo.framework.Protocol;
import com.acme.rpc.demo.framework.URL;


/**
 * @author K.
 * @Date 2021/1/15 23:13
 * 具体协议实现类
 */

public class NettyProtocol implements Protocol {

    @Override
    public void start(URL url,String serviceName) {
        NettyServer nettyServer = new NettyServer();
        try {
            nettyServer.start(serviceName,url, RpcStudyRegister.serviceMap);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public RpcResponse send(URL url, RpcRequest rpcRequest) {
        NettyClient nettyClient = new NettyClient();
        RpcResponse res = nettyClient.send(url, rpcRequest);
        return res;
    }

    @Override
    public RpcFuture sendFuture(int fetch, String serviceName, RpcRequest request) {

        NettyAsynHandler handler = ConnectManager.getInstance().chooseHandler(serviceName,fetch);
        RpcFuture future = handler.sendRequest(request);
        return future;
    }


}
