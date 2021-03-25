package com.acme.rpc.demo.framework.connect;

/**
 * @author: K.
 * @date: 2021/1/22 下午3:29
 */
public interface NodeChangePublisher {

     /**
      * 事件标识
      */
     int inactive=0;
     int remove=1;
     int add=2;
     int reactive=3;


     void addListener(NodeChangeListener listener) ;

     void removeListener(NodeChangeListener listener) ;

     void notifyListener(int state, String path) ;

}
