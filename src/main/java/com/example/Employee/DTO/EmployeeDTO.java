package com.example.Employee.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
	
	private Long employeeId;
	private String employeeName;
	private String employeeAddress;
	private String employeeMail;
	private String employeeMobilNum;

}
