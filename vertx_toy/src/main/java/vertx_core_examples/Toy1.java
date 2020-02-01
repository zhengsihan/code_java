package vertx_core_examples;

import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.NetServer;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Toy1 {
    void func1() {
        Vertx vertx = Vertx.vertx();
        Vertx v2 = Vertx.vertx(new VertxOptions().setWorkerPoolSize(40));
    }

    void func2() {
        Vertx vertx = Vertx.vertx();
        vertx.setPeriodic(2000, id -> System.out.println(new Date() + " timer fired!"));
    }

    void func3() {
//        Vertx vertx = Vertx.vertx();
//        WorkerExecutor executor = vertx.createSharedWorkerExecutor("my-pool");
//        executor.executeBlocking(promise -> {
//            String result = someAPI.blockingMethod("hello");
//            promise.complete(result);
//        }, asyncResult -> {
//            System.out.println("result is:" + asyncResult.result());
//        });
    }

    void func4() {
        JsonObject jsonObject = new JsonObject();
    }

    void func5() {
        Vertx vertx = Vertx.vertx();
        EventBus eb = vertx.eventBus();
    }

    void func6() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("str", "hello").put("price", "399");
        System.out.println(jsonObject);

        Map<String, Object> map = new HashMap<>();
        map.put("console", "ps4");
        jsonObject = new JsonObject(map);
        System.out.println(jsonObject);
    }

    void func7() {
        Vertx vertx = Vertx.vertx();
        NetServer netServer = vertx.createNetServer();
        netServer.connectHandler(netSocket -> {
            
        });
        netServer.listen(8081, "localhost", res -> {
            if(res.succeeded()){
                System.out.println(new Date() + " succeed!");
            }else{
                System.out.println(new Date() + "fail!");
            }
        });
    }

    public static void main(String[] args) {
        Toy1 t = new Toy1();
        t.func7();
    }
}
