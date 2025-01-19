package com.atsimoncc.ssm.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * ClassName: TestScopeController
 * Package: com.atsimoncc.controller
 * Description:
 */
@Controller
public class TestScopeController {

    @RequestMapping("/test/mav")
    public ModelAndView testMav() {
        /**
         *  ModelAndView 包含 Model 和 View 兩個功能
         *  Model: 向請求域中共想資料
         *  View: 設定邏輯視圖，實現頁面跳轉
         * */
        ModelAndView mav = new ModelAndView();
        // 向請求域中共想資料
        mav.addObject("testRequestScope", "hello, ModelAndView");
        // 設定邏輯視圖
        mav.setViewName("success");
        return mav;
    }

    @RequestMapping("/test/model")
    public String testModel(Model model) {
        model.addAttribute("testRequestScope", "hello, Model");
        return "success";
    }
    @RequestMapping("/test/modelMap")
    public String testModelMap(ModelMap modelMap) {
        modelMap.addAttribute("testRequestScope", "hello, ModelMap");
        return "success";
    }
    @RequestMapping("/test/map")
    public String testMap(Map<String, Object> map) {
        map.put("testRequestScope", "hello, Map");
        return "success";
    }
    @RequestMapping("/test/session")
    public String testSession(HttpSession session) {
        session.setAttribute("testSessionScope", "hello, session");
        return "success";
    }
    @RequestMapping("/test/application")
    public String testApplication(HttpSession session) { // 注意不能直接用 ServletContext
        ServletContext servletContext = session.getServletContext();
        servletContext.setAttribute("testApplicationScope", "hello, application");
        return "success";
    }
}
