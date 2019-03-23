package springboot.com.cn.aop;

import springboot.com.cn.interceptor.Interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @auther SyntacticSugar
 * @data 2019/3/24 0024上午 12:56
 */
public class ProxyBean  implements InvocationHandler {

    //public Object invoke(Object proxy, Method method, Object[] args);

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return null;
    }

    public static Object getProxyBean(Object target, Interceptor interceptor){

        return null;
    }


}
