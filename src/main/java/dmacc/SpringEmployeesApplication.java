package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Employee;
import dmacc.beans.Department;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.EmployeeRepository;

@SpringBootApplication
public class SpringEmployeesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmployeesApplication.class, args);
		
		/*
		 * ApplicationContext appContext = new
		 * AnnotationConfigApplicationContext(BeanConfiguration.class);
		 * 
		 * Contact c = appContext.getBean("contact", Contact.class);
		 * 
		 * System.out.println(c.toString());
		 */
	}
	
	@Autowired
	EmployeeRepository repo;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		Employee e = appContext.getBean("employee", Employee.class);
		e.setRole("Lead Accountant");
		repo.save(e);
		
		//Create a bean to use - not managed by Spring
		Employee d = new Employee("Sandra Boyton", "555-555-5556", "Accounting");
		Department a = new Department("Finance", "321");
		d.setDepartment(a);
		repo.save(d);
		
		List<Employee> allMyEmployees = repo.findAll();
		for(Employee people: allMyEmployees) {
			System.out.println(people.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	
	}

}