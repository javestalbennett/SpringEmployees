package dmacc.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Department;
import dmacc.beans.Employee;

@Configuration
public class BeanConfiguration {

	@Bean
	public Employee employee() {
		Employee bean = new Employee( );
		bean.setName("Dr. Seuss");
		bean.setPhone("555-555-5555");
		bean.setRole("human resources manager");
		return bean;
	}

	@Bean
	public Department department() {
		Department bean = new Department("Human Resources", "123");
		return bean;
	}


}