package zsh;

import org.junit.jupiter.api.Test;
import zsh.rq_producer.functions.MsgProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RqProducerApplicationTests {
    @Autowired
    MsgProducer msgProducer;
    @Test
    void contextLoads() {
        msgProducer.produceMsg01();
    }

}
