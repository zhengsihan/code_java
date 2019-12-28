package zsh.p1;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="p1")
public class Endpoint1 {

    @ReadOperation
    public String func1() {
        return "my custom endpoint";
    }
}
