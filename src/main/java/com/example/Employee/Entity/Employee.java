package com.example.Employee.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long employeeId;
	@Column(name="EMP_NAME")
	private String employeeName;
	@Column(name="EMP_ADDRESS")
	private String employeeAddress;
	@Column(name="EMP_MAIL")
	private String employeeMail;
	@Column(name="EMP.MOBILE.NUM")
	private String employeeMobilNum;
	

}
