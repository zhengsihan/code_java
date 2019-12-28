package zsh.spring_func.prac_annotation_primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
@Component
public class Demo {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Demo.class);
        GameService gs = ac.getBean("gameService", GameService.class);
        gs.say();
    }
}
