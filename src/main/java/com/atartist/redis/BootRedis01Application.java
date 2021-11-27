package com.atartist.redis;

import org.apache.tomcat.jni.Local;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class BootRedis01Application {

    public static void main(String[] args) {
        SpringApplication.run(BootRedis01Application.class, args);
    }

    @GetMapping("/cpu")
    public String cpu() {
        System.out.println("当前时间：" + LocalDateTime.now());
        while (true) {

        }
    }

}
