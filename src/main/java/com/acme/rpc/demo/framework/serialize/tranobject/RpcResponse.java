package com.acme.rpc.demo.framework.serialize.tranobject;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: K.
 * @date: 2021/1/19 下午5:12
 */
@Data
public class RpcResponse  {
    private String requestId;

    private Object result;

    private String error;
}
