package com.atsimoncc.dao;

import org.springframework.stereotype.Repository;
import com.atsimoncc.pojo.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: EmployeeDao
 * Package: mvc.dao
 * Description:
 */
// 模擬資料庫
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;

    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(1001, new Employee(1001, "E-A", "a@111.com", 1));
        employees.put(1002, new Employee(1002, "E-B", "b@111.com", 1));
        employees.put(1003, new Employee(1003, "E-C", "c@111.com", 0));
        employees.put(1004, new Employee(1004, "E-D", "d@111.com", 0));
        employees.put(1005, new Employee(1005, "E-E", "e@111.com", 1));
    }
    private static Integer initId = 1006;
    public void save(Employee employee) { // 新增和修改
        if (employee.getId() == null) {
            employee.setId(initId++);
        }
        employees.put(employee.getId(), employee);
    }
    public Collection<Employee> getAll() {
        return employees.values();
    }
    public Employee get(Integer id) {
        return employees.get(id);
    }
    public void delete(Integer id) {
        employees.remove(id);
    }
}

