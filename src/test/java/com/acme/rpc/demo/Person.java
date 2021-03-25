package com.acme.rpc.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: K.
 * @date: 2021/1/19 下午5:45
 */
@Data
@AllArgsConstructor
public class Person {
    private String name;
    private Integer age;

    public static void main(String[] args) {



    }
  /*  public static void test(){
        HelloService helloService = ProxyFactory.getProxy(HelloService.class);
        String result = helloService.qq();
        System.out.println(result);
    }*/
}
