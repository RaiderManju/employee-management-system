package employee_management_backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import employee_management_backend.model.Employee;
import employee_management_backend.repository.EmployeeRepository;
import employee_management_backend.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		return employeeRepository.findById(id).map(existing -> {
			existing.setName(employee.getName());
			existing.setEmail(employee.getEmail());
			existing.setPosition(employee.getPosition());
			return employeeRepository.save(existing);
		}).orElse(null);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}
}
