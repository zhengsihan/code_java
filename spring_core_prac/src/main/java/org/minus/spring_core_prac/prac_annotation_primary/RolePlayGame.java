package org.minus.spring_core_prac.prac_annotation_primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by zhengsihan, on 2019-11-05
 */
@Primary
@Component
public class RolePlayGame implements Game {
    @Override
    public String introduceMyself() {
        return "角色扮演游戏";
    }
}