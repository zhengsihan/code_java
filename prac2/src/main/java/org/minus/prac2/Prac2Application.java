package org.minus.prac2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.minus.prac2.dao")
public class Prac2Application {

    public static void main(String[] args) {
        SpringApplication.run(Prac2Application.class, args);
    }

}
