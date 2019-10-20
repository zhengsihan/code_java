package zsh.dbc.practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import zsh.dbc.practice.bean.Company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengsihan, on 2019-10-18
 */
@Configuration
@ImportResource("classpath:demo3.xml")
public class BeanDemo3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanDemo3.class);
        Company c = (Company) ac.getBean("company");
        c.setName("Capcom");
        List<String> list = new ArrayList<>();
        list.add("Monster Hunter");
        list.add("Devil May Cry");
        c.setGames(list);
        c.hello();
    }
}
