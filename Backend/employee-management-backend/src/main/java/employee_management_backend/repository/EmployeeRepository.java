package employee_management_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import employee_management_backend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	// Spring Data JPA gives CRUD methods automatically
}
