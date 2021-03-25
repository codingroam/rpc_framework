package com.acme.rpc.demo.framework.serialize;

/**
 * @author: K.
 * @date: 2021/1/19 下午5:15
 * 对象-字节转换接口
 */
public interface RpcSerializer {
    /**
     * 序列化
     * @param target
     * @return
     */
    byte[] serialize(Object target);

    /**
     * 反序列化
     * @param target
     * @param clazz
     * @param <T>
     * @return
     * @throws Exception
     */
    <T> T deserialize(byte[] target,Class<T> clazz) throws Exception;
}
