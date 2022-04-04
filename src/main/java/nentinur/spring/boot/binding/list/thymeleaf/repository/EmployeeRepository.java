package nentinur.spring.boot.binding.list.thymeleaf.repository;

import nentinur.spring.boot.binding.list.thymeleaf.employee.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository {
    void saveEmployee(Employee employee);
}
