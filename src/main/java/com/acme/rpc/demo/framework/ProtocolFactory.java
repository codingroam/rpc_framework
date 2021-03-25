package com.acme.rpc.demo.framework;

import com.acme.rpc.demo.framework.protocol.http.HttpProtocol;
import com.acme.rpc.demo.framework.protocol.netty.NettyProtocol;

/**
 * @author K.
 * @Date 2021/1/15 23:35
 * 协议工厂模式
 */
public class ProtocolFactory {
    public static HttpProtocol http() {
        return new HttpProtocol();
    }
    public static NettyProtocol netty(){
        return new NettyProtocol();
    }
}
