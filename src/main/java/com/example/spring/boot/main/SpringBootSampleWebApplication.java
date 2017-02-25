package com.example.spring.boot.main;
import com.example.spring.boot.controller.HelloWorldConroller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {HelloWorldConroller.class})
public class SpringBootSampleWebApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootSampleWebApplication.class, args);
    }
}