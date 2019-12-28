package zsh.rq_producer;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhengsihan, on 2019-10-29
 */
@Configuration
public class MsgQueue {
    public static final String TEST01 = "test_01";
    public static final String TEST02 = "test_02";

    @Bean
    public Queue test01() {
        return new Queue(TEST01);
    }

    @Bean
    public Queue test02() {
        return new Queue(TEST02);
    }
}
