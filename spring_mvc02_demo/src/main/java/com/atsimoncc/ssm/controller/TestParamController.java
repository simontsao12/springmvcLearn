package com.atsimoncc.ssm.controller;

import com.atsimoncc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * ClassName: TestParamController
 * Package: com.atsimoncc.controller
 * Description:
 */
@Controller
public class TestParamController {

    @RequestMapping("/param/servletAPI")
    public String gerParamByServletAPI(HttpServletRequest request) {
        HttpSession session = request.getSession();// 建立 cookie 用，向瀏覽器響應一個 cookie，方便 getParam() 方法的測試
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username: " + username + ", password: " + password);
        return "success";
    }

    @RequestMapping("/param")
    public String gerParam(
            @RequestParam(value = "username", required = true) String username,
            String password,
            @RequestHeader("referer") String referer,
            @CookieValue("GSESSIONID") String jsessionId) {
        System.out.println("jsessionId: " + jsessionId);
        System.out.println("referer: " + referer);
        System.out.println("username: " + username + ", password: " + password);
        return "success";
    }
    @RequestMapping("/param/pojo")
    public String gerParamByPojo(User user) {
        System.out.println("user: \n" + user);
        System.out.println("張三");
        return "success";
    }
}
