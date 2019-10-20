package zsh.dbc.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import zsh.dbc.practice.bean.Console;


/**
 * Created by zhengsihan, on 2019-10-18
 */
public class Demo_CommonSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Demo_AOP_SchemaBased.xml");
        Console c = (Console) ac.getBean("console2");
        c.hello();

    }
}
