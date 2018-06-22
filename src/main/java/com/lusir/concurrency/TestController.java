package com.lusir.concurrency;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequestMapping("/")
public class TestController {

    @RequestMapping("test.do")
    @ResponseBody
    public String test() {
        return "test";
    }
}
