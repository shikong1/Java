package com;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;

import javax.annotation.PostConstruct;

//限定了被@Repository 标注的接口才扫描
@MapperScan(basePackages = "com.hehe")
@SpringBootApplication(scanBasePackages = "com.hehe")
public class MybatisAnnotationApplication {

    public static void main(String[] args) {
        System.out.println("shikong");
        SpringApplication.run(MybatisAnnotationApplication.class, args);
    }
    @Autowired
    PlatformTransactionManager platformTransactionManager=null;

    //这个类对象被初始化后，会调用这个方法，通过IOC容器获取对应的Bean并监控他们；
    @PostConstruct
    public void viewTransationManager(){
        System.out.println(platformTransactionManager.getClass().getName());
    }
}