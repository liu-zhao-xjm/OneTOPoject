package com.jbit.bankoline;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.jbit.bankoline.mapper")
@SpringBootApplication
public class BankolineApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankolineApplication.class, args);
    }

}
