package org.minus.spring_core_prac.prac_annotation_primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by zhengsihan, on 2019-11-05
 */
@ComponentScan
@Component
public class Demo {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Demo.class);
        GameService gs = ac.getBean("gameService", GameService.class);
        gs.say();
    }
}
