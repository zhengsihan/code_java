package vertx_core_examples;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 实现简单的HTTP SERVER，可以接收请求，并返回响应
 */
public class SimpleHttpToy {
    String currentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }

    /**
     * https://vertx.io/docs/vertx-core/java/#_writing_http_servers_and_clients
     */
    void func1() {
        Vertx vertx = Vertx.vertx();
        HttpServer server = vertx.createHttpServer();
        server.requestHandler(httpServerRequest -> {
            System.out.println(String.format("%s 收到请求!", currentTime()));
            httpServerRequest.response()
                    .end(String.format("%s 您好^_^", currentTime()));
        });
        server.listen(9999, "127.0.0.1", httpServerAsyncResult -> {
            if(httpServerAsyncResult.succeeded()) {
                System.out.println("Server is now listening!");
            }else {
                System.out.println("Failed to bind!");
            }
        });
    }

    public static void main(String[] args) {
        SimpleHttpToy toy = new SimpleHttpToy();
        toy.func1();
//        toy.currentTime();
    }
}
