package springboot.com.cn.interceptor;


import springboot.com.cn.bean.Invocation;

public interface Interceptor {

    public boolean before();

    // 事后方法
     void after();

     Object around(Invocation invocation)
             throws Throwable;

    // 事后返回方法
     void afterReturning();

    // 事后异常方法
     void afterThrowing();

    boolean useAround();
}
