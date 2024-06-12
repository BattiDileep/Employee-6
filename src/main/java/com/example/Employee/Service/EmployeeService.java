package com.example.Employee.Service;

import java.util.List;

import com.example.Employee.DTO.EmployeeDTO;

public interface EmployeeService {
	
	public EmployeeDTO createEmployee(EmployeeDTO empdto);
	public EmployeeDTO getEmployeeById(Long employeeId);
	public List<EmployeeDTO> getAllEmployees();
	
	public String deleteEmployee(Long employeeId);

}
