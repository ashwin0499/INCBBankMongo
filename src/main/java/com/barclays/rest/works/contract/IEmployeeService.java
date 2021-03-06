package com.barclays.rest.works.contract;

import java.util.List;

import com.barclays.rest.works.entity.Employee;
import org.springframework.web.bind.annotation.RequestBody;

public interface IEmployeeService {
	public Employee insertEmployee(Employee employee); 
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int empId);
//	public Employee updateEmployee(Employee employee);
	public String deleteEmployee(int empId);
	public Employee findByAccID(int accId);
	public Employee verifyacholder(int empId);

	public List<Employee> getEmployeesByName(String name);
	public List<Employee> getEmployeesBetweenSalary(double minSal, double maxSal);


}
