package nentinur.spring.boot.binding.list.thymeleaf.controller;

import lombok.AllArgsConstructor;
import nentinur.spring.boot.binding.list.thymeleaf.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public String showEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee/createEmployeeForm";
    }
}
