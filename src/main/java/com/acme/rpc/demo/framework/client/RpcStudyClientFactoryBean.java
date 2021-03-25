package com.acme.rpc.demo.framework.client;

import com.acme.rpc.demo.framework.ProxyFactory;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author: K.
 * @date: 2021/1/20 下午3:08
 * bean工厂类，这里为接口代理其方法
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class RpcStudyClientFactoryBean implements FactoryBean<Object> {
    private Class<?> type;

    @Override
    public Object getObject() throws Exception {
        //根据RpcStudeClient的mode字段选择以哪种方式代理
        RpcStudyClient annotation = type.getAnnotation(RpcStudyClient.class);
        int mode = annotation.mode();
        return mode==RpcStudyClient.asyn?ProxyFactory.getAsyncProxy(this.type):ProxyFactory.getProxy(this.type);
    }

    @Override
    public Class<?> getObjectType() {
        return this.type;
    }
}
