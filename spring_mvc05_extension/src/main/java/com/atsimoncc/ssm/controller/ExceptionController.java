package com.atsimoncc.ssm.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * ClassName: ExceptionController
 * Package: com.atsimoncc.controller
 * Description:
 */
// 將目前類別標識為異常處理的元件
@ControllerAdvice
public class ExceptionController {

    // 設定要處理的異常訊息
    @ExceptionHandler(ArithmeticException.class)
    public String handleException(Throwable ex, Model model){
        // ex 表示控制器方法所出現的異常
        model.addAttribute("ex", ex);
        model.addAttribute("test", "你的數學不錯喔...");
        return "error";
    }

}
