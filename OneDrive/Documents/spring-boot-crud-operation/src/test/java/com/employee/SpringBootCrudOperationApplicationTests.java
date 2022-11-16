package com.employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

@SpringBootTest
class SpringBootCrudOperationApplicationTests {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testSaveEmployees()
	{
		Employee e = new Employee();
		e.setEmployeeid(343);
		e.setEmployeename("sde");
		e.setDesignation("ewr");
		e.setPhone(3456);
		//when(employeeRepository.save(e).thenReturn(e));
		//assertEquals(e, employeeService.saveOrUpdate(e));
	}

}
