package com.example.Employee.Mapper;

import com.example.Employee.DTO.EmployeeDTO;
import com.example.Employee.Entity.Employee;

public class EmployeeMapper {
	
	public static Employee mapToEmployee(EmployeeDTO empdto) {
		return new Employee(empdto.getEmployeeId(),
							empdto.getEmployeeName(),
							empdto.getEmployeeAddress(),
							empdto.getEmployeeMail(),
							empdto.getEmployeeMobilNum());
	}
	public static EmployeeDTO mapToEmployeeDTO(Employee emp) {
		return new EmployeeDTO(emp.getEmployeeId(),
								emp.getEmployeeName(),
								emp.getEmployeeAddress(),
								emp.getEmployeeMail(),
								emp.getEmployeeMobilNum());
	}

}
