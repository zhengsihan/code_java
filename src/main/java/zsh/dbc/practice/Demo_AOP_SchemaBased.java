package zsh.dbc.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zsh.dbc.practice.service.DBOService;

/**
 * Created by zhengsihan, on 2019-10-18
 */
public class Demo_AOP_SchemaBased {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Demo_AOP_SchemaBased.xml");
        DBOService t1 = (DBOService) ac.getBean("target");
        t1.save();
    }
}
