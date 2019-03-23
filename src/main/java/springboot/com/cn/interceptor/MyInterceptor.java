package springboot.com.cn.interceptor;


import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.Invocation;

import java.lang.reflect.InvocationTargetException;

/**
 * @auther SyntacticSugar
 * @data 2019/3/24 0024上午 12:40
 */
@Slf4j
public class MyInterceptor implements Interceptor {

    public boolean before() {
      log.info("before  start running ");
        return true;
    }

    public void after() {
      log.info("after  start running ");

    }

    public Object around(Invocation invocation) throws Throwable {
        log.info("before running ");
        Object proceed = invocation.proceed();
        log.info("after  running ");
        return proceed;
    }

    public void afterReturning() {
        log.info("afterReturning  start running ");
    }

    public void afterThrowing() {
        log.info("afterThrowing  start running ");
    }

    public boolean useAround() {
        log.info("useAround  start running ");
        return true;
    }
}
