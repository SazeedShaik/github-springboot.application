package com.employee.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.employee.model.Employee;
import com.employee.service.EmployeeService;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@Api(value="/employee" , tags="Employee Controller")
public class EmployeeController 
{
@Autowired
EmployeeService employeeService;

//creating a get mapping that retrieves all the employee detail from the database 
@GetMapping("/employee")
@ApiOperation(value = "Get all the Employees from the application ", response = Employee.class, tags = "getAllEmployees")
private List<Employee> getAllEmployees() 
{
return employeeService.getAllEmployees();
}


//creating a get mapping that retrieves the detail of a specific employee
@GetMapping("/employee/{employeeid}")
@ApiOperation(value = "Get the Employee from the application ", response = Employee.class, tags = "getEmployee")
private Employee getEmployee(@PathVariable("employeeid") int employeeid) 
{
return employeeService.getEmployeeById(employeeid);
}


//creating a delete mapping that deletes a specified employee
@DeleteMapping("/employee/{employeeid}")
@ApiOperation(value = "Delete the Employees from the application ", response = Employee.class, tags = "deleteEmployee")
private void deleteEmployee(@PathVariable("employeeid") int employeeid) 
{
employeeService.delete(employeeid);
}


//creating post mapping that post the employee detail in the database
@PostMapping("/employees")
@ApiOperation(value = "Save the Employees into the application ", response = Employee.class, tags = "saveEmployee")
private int saveEmployee(@RequestBody Employee employee) 
{
employeeService.saveOrUpdate(employee);
return employee.getEmployeeid();
}


//creating put mapping that updates the book detail 
@PutMapping("/employees")
@ApiOperation(value = "Update the Employee into the application ", response = Employee.class, tags = "updateEmployee")
private Employee updateEmployee(@RequestBody Employee employee) 
{
employeeService.saveOrUpdate(employee);
return employee;
}
}
