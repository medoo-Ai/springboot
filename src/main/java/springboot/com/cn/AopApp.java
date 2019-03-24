package springboot.com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @auther SyntacticSugar
 * @data 2019/3/24 0024上午 12:28
 */
@SpringBootApplication
public class AopApp {

    public static void main(String[] args) {
        SpringApplication.run(AopApp.class, args);
        System.out.println("server  started  ready");
    }
}
