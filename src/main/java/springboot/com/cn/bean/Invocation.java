package springboot.com.cn.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @auther SyntacticSugar
 * @data 2019/3/24 0024下午 1:31
 */

@Data
@AllArgsConstructor
public class Invocation {
    private Object[] params;
    private Method method;
    private Object target;
    public Invocation(Object target, Method method, Object[] params) {
        this.target = target;
        this.method = method;
        this.params = params;
    }
    public Object proceed() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target, params);
    }
}
