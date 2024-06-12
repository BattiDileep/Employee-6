package com.example.Employee.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.DTO.EmployeeDTO;
import com.example.Employee.Entity.Employee;
import com.example.Employee.Service.EmployeeService;

@RestController
@RequestMapping("/API/Employee")
public class EmployeeRest {
	@Autowired
	EmployeeService empsrvc;
	@PostMapping
	public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO empdto){
		EmployeeDTO saveempdto=empsrvc.createEmployee(empdto);
		return new  ResponseEntity<EmployeeDTO>(saveempdto,HttpStatus.CREATED);
	}
	@GetMapping("{id}")
	public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("id") Long employeeId){
		EmployeeDTO empdto=empsrvc.getEmployeeById(employeeId);
		return ResponseEntity.ok(empdto);
	}
	@GetMapping
	public ResponseEntity<List<EmployeeDTO>> getAllEmployees(){
		List<EmployeeDTO> employeesdto= empsrvc.getAllEmployees();
		return ResponseEntity.ok(employeesdto);
	}
	
	String s="delete succuss";
	@DeleteMapping("{id}")
	public String deleteEmployee(@PathVariable("id") Long employeeId){
		String s=empsrvc.deleteEmployee(employeeId);
		return s;
	}

}
