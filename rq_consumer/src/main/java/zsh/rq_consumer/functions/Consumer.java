package zsh.rq_consumer.functions;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by zhengsihan, on 2019-10-29
 */
@Component
public class Consumer {

    @RabbitListener(queues = "test_01")
    public void handler_test01(String msg) {
        System.out.println(String.format("Receiver--01-- : %s", msg));
    }

    @RabbitListener(queues = "test_01")
    public void handler_test02(String msg) {
        System.out.println(String.format("Receiver--01-- : %s", msg));
    }

    @RabbitListener(queues = "test_02")
    public void handler_test03(String msg) {
        System.out.println(String.format("Receiver--02-- : %s", msg));
    }

    @RabbitListener(queues = "test_02")
    public void handler_test04(String msg) {
        System.out.println(String.format("Receiver--02-- : %s", msg));
    }
}
