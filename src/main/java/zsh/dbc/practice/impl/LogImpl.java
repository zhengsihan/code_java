package zsh.dbc.practice.impl;

import org.springframework.stereotype.Component;
import zsh.dbc.practice.service.LogService;

/**
 * Created by zhengsihan, on 2019-10-20
 */
@Component("log")
public class LogImpl implements LogService {
    @Override
    public void sayHi() {
        System.out.println("function invokes...");
    }
}
