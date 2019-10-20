package zsh.dbc.practice.bean;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengsihan, on 2019-10-18
 */

@Component("company")
public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getGames() {
        return games;
    }

    public void setGames(List<String> games) {
        this.games = games;
    }

    private List<String> games;

    public Company() {
        setGames(new ArrayList<String>());
    }

    public void hello(){
        System.out.println(String.format("This company is %s", name));
        System.out.println(games);
    }
}
