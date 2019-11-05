package org.minus.spring_core_prac.prac_annotation_primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhengsihan, on 2019-11-05
 */
@Component
public class GameService {
    @Autowired
    private Game game;

    public void say() {
        System.out.println(game.introduceMyself());
    }
}
