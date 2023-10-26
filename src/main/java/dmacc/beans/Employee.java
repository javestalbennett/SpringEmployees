/**
 * @author Joshua Vestal-Bennett - javestalbennett
 * CIS175 - Fall 2023
 * Oct 25, 2023
 */
package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * 
 */
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String phone;
	private String role;
	@Autowired
	private Department department;

	// no arg constructor
	public Employee( ) {
		super();
		this.role = "accountant";
	}

	public Employee(String name) {
		this.name = name;
	}
	public Employee(String name, String phone, String role) {
		this.name = name;
		this.phone = phone;
		this.role = role;
	}
	
	public Employee(int id, String name, String phone, String role) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.role = role;
	}

	//create getters and setters too

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the relationship
	 */
	public String getRole() {
		return role;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param relationship the relationship to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Contact [id = “ + id + “, name=" + name + ", phone=" + phone + ", role=" + role + ", department=" + department + "]";
	}
	
	

}
