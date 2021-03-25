package com.acme.rpc.demo.framework.client;

import com.acme.rpc.demo.DemoApplication;
import com.acme.rpc.demo.framework.connect.ConnectManager;
import org.springframework.beans.factory.InitializingBean;

import org.springframework.stereotype.Component;

/**
 * @author: K.
 * @date: 2021/1/27 下午2:38
 */
@Component
public class ConnectMangerInitlizer implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        if(DemoApplication.mode==1){
            ConnectManager.getInstance().init();
        }
    }
}
