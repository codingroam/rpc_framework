package com.acme.rpc.demo.framework.client.requestlimit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

/**
 * @author: K.
 * @date: 2021/1/27 下午3:48
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestLimit {
    int mode() default RateLimitPolicy.TOKEN_BUCKET_LIMITER;
    int value() default 200;
    int timeOut() default 100;
    TimeUnit timeUnit() default TimeUnit.MILLISECONDS;
}
