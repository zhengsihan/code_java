package zsh.dbc.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zsh.dbc.practice.bean.DBOImpl;
import zsh.dbc.practice.bean.Target1;

/**
 * Created by zhengsihan, on 2019-10-18
 */
public class BeanDemo2 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("demo2.xml");
        DBOImpl t1 = (DBOImpl) ac.getBean("target");
        t1.save();
    }
}
