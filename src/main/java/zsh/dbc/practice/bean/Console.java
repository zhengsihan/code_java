package zsh.dbc.practice.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhengsihan, on 2019-10-18
 */
public class Console {
    private String name;
    private long price;
    private Map<String, Long> games = new HashMap<>();
    private List<String> gameList = new ArrayList<>();

    public List<String> getGameList() {
        return gameList;
    }

    public void setGameList(List<String> gameList) {
        this.gameList = gameList;
    }

    public Map<String, Long> getGames() {
        return games;
    }

    public void setGames(Map<String, Long> games) {
        this.games = games;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Console(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public Console() {}

    public void hello() {
//        System.out.println("hello, i'm %s, price: %d", this.name, this.price);
        System.out.println(String.format("hello, i'm %s, price: %d", this.name, this.price));
        System.out.println(getGames());
        System.out.println(getGameList());
    }

    public void init() {
        System.out.println("A Console is init...");
    }
    public void destroy() {
        System.out.println("A Console is destroy...");
    }
}
