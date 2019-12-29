package zsh.spring_func.example_anno_primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameService {

    private Game game;

    @Autowired
    @Qualifier("actionGame")//指定装配哪个实现类
    public void setGame(Game game) {
        this.game = game;
    }

    public void say() {
        System.out.println(game.introduceMyself());
    }
}
