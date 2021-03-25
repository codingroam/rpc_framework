package com.acme.rpc.demo.framework.protocol.http;

import com.acme.rpc.demo.framework.protocol.netty.asyn.RpcFuture;
import com.acme.rpc.demo.framework.serialize.tranobject.RpcRequest;
import com.acme.rpc.demo.framework.serialize.tranobject.RpcResponse;
import com.acme.rpc.demo.framework.Protocol;
import com.acme.rpc.demo.framework.URL;

/**
 * @author K.
 * @Date 2021/1/15 23:31
 * http协议
 */
@Deprecated
public class HttpProtocol implements Protocol {
    @Override
    public void start(URL url,String serviceName) {
        HttpServer server=new HttpServer();
        server.start(url.getHostname(),url.getPort());
    }

    @Override
    public RpcResponse send(URL url, RpcRequest rpcRequest) {
        HttpClient client=new HttpClient();
        RpcResponse res = client.post(url.getHostname(), url.getPort(), rpcRequest);
        return res;
    }

    @Override
    public RpcFuture sendFuture(int fetch, String serviceName, RpcRequest request) {
        return null;
    }




}
