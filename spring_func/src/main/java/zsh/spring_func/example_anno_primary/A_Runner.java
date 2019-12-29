package zsh.spring_func.example_anno_primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
@Component
public class A_Runner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(A_Runner.class);
        GameService gs = ac.getBean(GameService.class);
        gs.say();
    }
}
