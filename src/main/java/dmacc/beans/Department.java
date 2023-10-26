/**
 * @author Joshua Vestal-Bennett - javestalbennett
 * CIS175 - Fall 2023
 * Oct 25, 2023
*/
package dmacc.beans;

import jakarta.persistence.Embeddable;

/**
 * 
 */
@Embeddable
public class Department {
	private String employeeDeparment;
	private String departmentNumber;

	public Department(String employeeDeparment, String departmentNumber) {
		this.employeeDeparment = employeeDeparment;
		this.departmentNumber = departmentNumber;
	}
	
	
	
	/**
	 * @return the employeeDeparment
	 */
	public String getEmployeeDeparment() {
		return employeeDeparment;
	}



	/**
	 * @param employeeDeparment the employeeDeparment to set
	 */
	public void setEmployeeDeparment(String employeeDeparment) {
		this.employeeDeparment = employeeDeparment;
	}



	/**
	 * @return the departmentNumber
	 */
	public String getDepartmentNumber() {
		return departmentNumber;
	}



	/**
	 * @param departmentNumber the departmentNumber to set
	 */
	public void setDepartmentNumber(String departmentNumber) {
		this.departmentNumber = departmentNumber;
	}



	@Override
	public String toString() {
		return "Employee Deparment [employeeDeparment=" + employeeDeparment + ", departmentNumber=" + departmentNumber
				+  "]";
	}
}
