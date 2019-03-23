package springboot.com.cn.service.impl;

import lombok.extern.slf4j.Slf4j;
import springboot.com.cn.service.HelloService;

/**
 * @auther SyntacticSugar
 * @data 2019/3/24 0024上午 12:32
 */
@Slf4j
public class HelloServiceImpl implements HelloService {

    public void sayHello(String name) {
        if (name == null || name.trim() == "") {
            log.info("name 不能为空  {}",name);
        }
        System.out.println(name);
    }
}
