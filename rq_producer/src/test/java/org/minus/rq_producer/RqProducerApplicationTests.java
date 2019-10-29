package org.minus.rq_producer;

import org.junit.jupiter.api.Test;
import org.minus.rq_producer.rq.MsgProducer;
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
