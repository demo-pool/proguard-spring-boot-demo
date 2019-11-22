package cn.devit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import cn.devit.demo.api.UserService;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        UserService bean = ctx.getBean(UserService.class);
        System.out.println("Bean Class:" + bean.getClass());
        System.out.println("Dto Class:" + bean.getUser("1").getClass());
        System.out.println("Dto toString:" + bean.getUser("1"));
    }
}