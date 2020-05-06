package com.nero.gitest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("info")
    public String info() {
        return "123gggtttt";
    }

    //修改了testgit提交

    //我在修
}
