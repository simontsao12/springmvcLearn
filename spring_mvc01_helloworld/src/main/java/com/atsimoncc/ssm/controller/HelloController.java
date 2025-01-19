package com.atsimoncc.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: HelloController
 * Package: com.atsimoncc.controller
 * Description:
 */
// 注意要使用 jdk 11，若使用 jdk 17 會出錯
@Controller
public class HelloController {
    @RequestMapping("/")
    public String protal() {
        // 將邏輯視圖返回
        return "index";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "success";
    }
}
