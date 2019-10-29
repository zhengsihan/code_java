package org.minus.quartz_prac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class QuartzPracApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuartzPracApplication.class, args);
    }
}
