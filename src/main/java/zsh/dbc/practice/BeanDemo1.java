package zsh.dbc.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import zsh.dbc.practice.bean.Console;


/**
 * Created by zhengsihan, on 2019-10-18
 */
public class BeanDemo1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("demo2.xml");
        Console c = (Console) ac.getBean("console2");
        c.hello();

    }
}
