package zsh.dbc.practice.bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by zhengsihan, on 2019-10-19
 */
@Aspect
@Component("pointcut2")
public class Advice2 {
    @Pointcut(value="execution(* zsh.dbc.practice.bean.Company.hello(..))")
    private void PointCutMethod(){}

    @Before("PointCutMethod()")
    public void log(){
        System.out.println("aspect invoke...");
    }
}
