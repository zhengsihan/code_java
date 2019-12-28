package zsh.prac_annotation_primary;

import org.springframework.stereotype.Component;

/**
 * Created by zhengsihan, on 2019-11-05
 * 当一个接口有多个实现的时候，可以通过@Primary指定优先装配的类。
 * 也可以在@Autowired后面用@Quarlifier指定具体实现类
 */
//@Primary
@Component
public class ActionGame implements Game{
    @Override
    public String introduceMyself() {
        return "动作游戏";
    }
}
