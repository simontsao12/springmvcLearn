package com.atsimoncc.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ClassName: TestRequestMappingController
 * Package: com.atsimoncc.controller
 * Description:
 */
@Controller
// @RequestMapping("/test")
public class TestRequestMappingController {
    // 此時控制器方法所匹配的請求的請求路徑為 /test/hello
    @RequestMapping(
            value = {"/hello", "/abc"},
            method = {RequestMethod.POST, RequestMethod.GET},
            // params = {"username", "!password", "age = 20", "gender != 男"},
            headers = {"referer"}
            )
    public String hello() {
        return "success";
    }
    @RequestMapping("/a?a/test/ant")
    public String testAnt() {
        return "success";
    }
    @RequestMapping("/test/rest/{username}/{id}") // 使用佔位符 {}
    public String testRest(@PathVariable("id") Integer id, @PathVariable("username") String username) { // 使用 @PathVariable 將佔位符的值傳給參數
        System.out.println("id: " + id);
        System.out.println("username: " + username);
        return "success";
    }
}
