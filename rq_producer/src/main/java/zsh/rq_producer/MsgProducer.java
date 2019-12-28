package zsh.rq_producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhengsihan, on 2019-10-29
 */
@Component
public class MsgProducer {

    @Autowired
    AmqpTemplate amqpTemplate;

    public void produceMsg01() {
        amqpTemplate.convertAndSend(MsgQueue.TEST01, "Text from text_01");
    }

    public void produceMsg02() {
        amqpTemplate.convertAndSend(MsgQueue.TEST01, "Text from text_02");
    }
}
