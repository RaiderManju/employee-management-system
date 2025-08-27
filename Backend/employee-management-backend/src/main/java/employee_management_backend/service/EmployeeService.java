package employee_management_backend.service;

import java.util.List;

import employee_management_backend.model.Employee;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Long id, Employee employee);
    Employee getEmployeeById(Long id);
    List<Employee> getAllEmployees();
    void deleteEmployee(Long id);
}
