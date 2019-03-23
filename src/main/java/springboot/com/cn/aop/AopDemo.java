package springboot.com.cn.aop;

import springboot.com.cn.interceptor.MyInterceptor;
import springboot.com.cn.service.HelloService;
import springboot.com.cn.service.impl.HelloServiceImpl;

/**
 * @auther SyntacticSugar
 * @data 2019/3/24 0024上午 12:51
 */
public class AopDemo {

    //public static Object getProxyBean(Object target, Interceptor interceptor)
    public static void main(String[] args) {
        HelloService proxy=(HelloService)ProxyBean.getProxyBean(new HelloServiceImpl(),new MyInterceptor());
        proxy.sayHello("dadoudou");
    }

}
