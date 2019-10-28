package org.minus.prac2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhengsihan, on 2019-10-28
 */
@Controller
public class FreemarkerController {

    @GetMapping("1")
    public @ResponseBody String sayHi() {
        return "Hi, here is me";
    }

    @GetMapping("/getfm")
    public String getfm() {
        return "fm";//application.properties,加入freemarker的后缀名设置，别忘记加"."
    }
}
