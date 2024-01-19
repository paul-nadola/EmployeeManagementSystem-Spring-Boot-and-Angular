package crudPart2.crudBackend;

import crudPart2.crudBackend.model.Employee;
import crudPart2.crudBackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee();
		employee.setFirstName("Paul");
		employee.setLastName("Oyinga");
		employee.setEmailId("nadola@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee.setFirstName("John");
		employee.setLastName("Cena");
		employee.setEmailId("youcantseeme@gmail.com");
		employeeRepository.save(employee1);

	}
}
