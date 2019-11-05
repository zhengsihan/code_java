package zsh.dbc.practice.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by zhengsihan, on 2019-11-05
 */
@Component
public class Game {
    private String name = "origin";

    @Primary
    public void Game() {
        this.name = "fun1";
    }

    public void Game(String a) {
        this.name = "fun2";
    }

    @Override
    public String toString() {
        return this.name;
    }
}
