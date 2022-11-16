package com.employee.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity

//defining class name as Table name
@Table
public class Employee
{

@Id
@Column
private int employeeid;
@Column
private String employeename;
@Column
private String designation;
@Column
private int phone;

public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}



}