package employee_management_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee") // must match your PostgreSQL table name
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false, unique = true)
	private String email;

	private String position;

	// --- Getters and Setters ---
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
