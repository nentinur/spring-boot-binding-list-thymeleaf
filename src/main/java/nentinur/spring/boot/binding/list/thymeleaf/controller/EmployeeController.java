package nentinur.spring.boot.binding.list.thymeleaf.controller;

import lombok.AllArgsConstructor;
import nentinur.spring.boot.binding.list.thymeleaf.employee.Employee;
import org.springframework.http.MediaType;
import nentinur.spring.boot.binding.list.thymeleaf.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@AllArgsConstructor
@RequestMapping(value = "/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public String showEmployeeForm(Model model) {
        model.addAttribute("employees", new Employee());
        return "employees/createEmployeeForm";
    }

    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public String saveEmployee(@ModelAttribute Employee employee) {
        employeeService.save(employee);
        return "employees/success";
    }

    @PostMapping(path = "/requestpart", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<Object> saveEmployee(@RequestPart Employee employee, @RequestPart MultipartFile document) {
        employee.setDocument(document);
        employeeService.save(employee);
        return ResponseEntity.ok().build();
    }

    @PostMapping(path = "/requestparam", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<Object> saveEmployee(@RequestParam String name, @RequestPart MultipartFile document) {
        Employee employee = new Employee(name, document);
        employeeService.save(employee);
        return ResponseEntity.ok().build();
    }

}