package com.aftvc.top.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ Author     ：Yan
 * @ Date       ：Created in 12:50 2020/3/25
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@Controller
public class TestController {

    @RequestMapping(value = "/test")
    public String index(){
        System.out.println("测试....");
        return "main";
    }
}
