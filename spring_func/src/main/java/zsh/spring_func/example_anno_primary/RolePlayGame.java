package zsh.spring_func.example_anno_primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class RolePlayGame implements Game {
    @Override
    public String introduceMyself() {
        return "角色扮演游戏";
    }
}
