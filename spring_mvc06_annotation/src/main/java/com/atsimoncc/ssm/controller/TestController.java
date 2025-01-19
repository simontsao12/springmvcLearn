package com.atsimoncc.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: TestController
 * Package: com.atsimoncc.controller
 * Description:
 */
@Controller
public class TestController {
    @RequestMapping("/test/hello")
    public String testHello() {
        System.out.println(1 / 0); // 測試錯誤頁面跳轉
        return "success";
    }
}
