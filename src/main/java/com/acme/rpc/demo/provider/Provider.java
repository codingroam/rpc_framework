package com.acme.rpc.demo.provider;

import com.acme.rpc.demo.framework.Protocol;
import com.acme.rpc.demo.framework.ProtocolFactory;
import com.acme.rpc.demo.framework.URL;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author: K.
 * @date: 2021/1/15 下午6:58
 */
@Deprecated
public class Provider {

    public static void main(String[] args) throws UnknownHostException {
        //这里多个接口的话，都要注册上去
        String hostAddress = InetAddress.getLocalHost().getHostName();
        URL url=new URL(hostAddress,8080);
//        ZkRegister.register(HelloService.class.getName(),url,HelloServiceImpl.class);
        Protocol server= ProtocolFactory.netty();
        server.start(url,null);

    }

}
