package com.report.demo;

import com.report.demo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "api")
public class ReportController {


    @GetMapping(path = "report")
    public String doSomething(Model model) {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee();
        employee1.setId("1");
        employee1.setName("ABC");
        employees.add(employee1);
        Employee employee2 = new Employee();
        employee2.setId("2");
        employee2.setName("DEF");
        employees.add(employee2);
        model.addAttribute("list", employees);
        return "report";
    }
}