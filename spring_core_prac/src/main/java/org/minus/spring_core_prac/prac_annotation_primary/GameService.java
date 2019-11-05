package org.minus.spring_core_prac.prac_annotation_primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by zhengsihan, on 2019-11-05
 */
@Component
public class GameService {
    @Autowired
    @Qualifier("actionGame")//指定装配哪个实现类
    private Game game;

    public void say() {
        System.out.println(game.introduceMyself());
    }
}
