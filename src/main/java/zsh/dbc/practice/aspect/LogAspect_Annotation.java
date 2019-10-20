package zsh.dbc.practice.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by zhengsihan, on 2019-10-20
 */
@Aspect
@Component("logAspect")
public class LogAspect_Annotation {
    @Pointcut("execution (* zsh.dbc.practice.service.LogService.sayHi(..))")
    private void anyOldTransfer(){}

    @Before("anyOldTransfer()")
    public void log(){
        System.out.println("---->Aspect calling");
    }
}
