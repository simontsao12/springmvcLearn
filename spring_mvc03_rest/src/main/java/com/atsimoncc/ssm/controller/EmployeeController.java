package com.atsimoncc.ssm.controller;

import com.atsimoncc.dao.EmployeeDao;
import com.atsimoncc.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * ClassName: EmployeeController
 * Package: com.atsimoncc.controller
 * Description:
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
    // 查詢所有員工資料 /employee
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployee(Model model) {
        // 獲取資料
        Collection<Employee> all = employeeDao.getAll();
        // 將資料放入請求範圍
        model.addAttribute("employees", all);
        // 跳轉到列表頁面
        return "employee_list";
    }
    // 跳轉到新增頁面 /to/add
    // 新增員工資料 /employee
    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String addEmployee(Employee employee) {
        employeeDao.save(employee);
        // 重定向列表頁面
        return "redirect:/employee";
    }
    // 跳轉到修改頁面 /employee/1
    // 修改員工資料 /employee
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public String toUpdate(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee", employee);
        //跳到employee_update.html
        return "employee_update";
    }
    @RequestMapping(value = "/employee", method = RequestMethod.PUT)
    public String updateEmployee(Employee employee){
        employeeDao.save(employee);
        // 重定向列表頁面
        return "redirect:/employee";
    }
    // 刪除員工資料 /employee/1
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        // 重定向列表頁面
        return "redirect:/employee";
    }
}
