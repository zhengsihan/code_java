package zsh.spring_func.example_springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value="/mvc")
@Controller
public class abc {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello() {
        return "hello";
    }
}
