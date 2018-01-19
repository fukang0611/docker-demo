package com.fukang.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试Controller
 * Created by Administrator on 2018/1/9.
 */
@RestController
public class IndexController {

    @RequestMapping("/hello")
    public String index(){
        return "<h1>Hello Spring-Boot Maven Docker</h1>";
    }
}
