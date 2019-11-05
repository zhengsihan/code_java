package zsh.dbc.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import zsh.dbc.practice.bean.Game;
import zsh.dbc.practice.service.LogService;

/**
 * Created by zhengsihan, on 2019-10-20
 */
@Configuration
@ComponentScan //相当于 <context:component-scan />
@EnableAspectJAutoProxy //相当于 <aop:aspectj-autoproxy />
public class Demo_Annotation {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Demo_Annotation.class);
//        LogService ls = (LogService) ac.getBean("log");
//        ls.sayHi();
        Game g = ac.getBean("game", Game.class);
        System.out.println(g);
    }
}
