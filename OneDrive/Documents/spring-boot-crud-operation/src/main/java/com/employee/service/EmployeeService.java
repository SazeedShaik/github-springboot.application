package com.employee.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
@Autowired
EmployeeRepository employeeRepository;

//getting all employee record by using the method findaAll() of CrudRepository
public List<Employee> getAllEmployees() 
{
List<Employee> employee = new ArrayList<Employee>();
employeeRepository.findAll().forEach(employees -> employee.add(employees));
return employee;
}

//getting a specific record by using the method findById() of CrudRepository
public Employee getEmployeeById(int id) 
{
return employeeRepository.findById(id).get();
}


//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(Employee employee) 
{
employeeRepository.save(employee);
}


//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(int id) 
{
employeeRepository.deleteById(id);
}


//updating a record
public void update(Employee employee, int employeeid) 
{
employeeRepository.save(employee);
}
}