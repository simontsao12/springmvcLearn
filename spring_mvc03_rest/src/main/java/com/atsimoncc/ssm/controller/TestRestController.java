package com.atsimoncc.ssm.controller;

import org.springframework.web.bind.annotation.*;

/**
 * ClassName: TestRestController
 * Package: com.atsimoncc.controller
 * Description:
 */
@RestController
public class TestRestController {
    // @RequestMapping(value = "/user", method = RequestMethod.GET)
    @GetMapping("/user")
    public String getAllUser() {
        System.out.println("查詢所有客戶資料 --> /user --> get");
        return "success";
    }
    // @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable Integer id) {
        System.out.println("根據 id 查詢客戶資料 --> /user/" + id + " --> get");
        return "success";
    }
    // @RequestMapping(value = "/user", method = RequestMethod.POST)
    @PostMapping("/user")
    public String insertUser() {
        System.out.println("新增客戶資料 --> /user --> post");
        return "success";
    }
    // @RequestMapping(value = "/user", method = RequestMethod.PUT)
    @PutMapping("/user")
    public String updatetUser() {
        System.out.println("修改客戶資料 --> /user --> put");
        return "success";
    }
    // @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable Integer id) {
        System.out.println("刪除客戶資料 --> /user/" + id + " --> delete");
        return "success";
    }
}
