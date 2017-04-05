package com.xiaofeng.web;

import com.xiaofeng.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Chen Xiaofeng on 2017/3/16.
 */

@Controller
public class HelloController {

//    @RequestMapping("/hello")
//    public String hello() {
//        return "Hello World";
//    }

    @RequestMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }

    @RequestMapping("/")
    public String toIndex(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
