package com.atsimoncc.ssm.controller;

import com.atsimoncc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName: HelloController
 * Package: com.atsimoncc.controller
 * Description:
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

}
