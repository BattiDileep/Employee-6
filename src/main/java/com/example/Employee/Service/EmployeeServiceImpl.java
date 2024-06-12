package com.example.Employee.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Employee.DTO.EmployeeDTO;
import com.example.Employee.Entity.Employee;
import com.example.Employee.Exception.ResourceNotFoundException;
import com.example.Employee.Mapper.EmployeeMapper;
import com.example.Employee.Repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepo emprepo;

	@Override
	public EmployeeDTO createEmployee(EmployeeDTO empdto) {
		Employee emp=EmployeeMapper.mapToEmployee(empdto);
		Employee saveemp=emprepo.save(emp);
		return EmployeeMapper.mapToEmployeeDTO(saveemp);
	}
	public EmployeeDTO getEmployeeById(Long employeeId) {
		Employee emp=emprepo.findById(employeeId)
		.orElseThrow(() -> new ResourceNotFoundException("ResourceNotFoundException"+employeeId));
		return EmployeeMapper.mapToEmployeeDTO(emp);
	}
	@Override
	public List<EmployeeDTO> getAllEmployees() {
		List<Employee> employees= emprepo.findAll();
		return employees.stream().map((n)->EmployeeMapper.mapToEmployeeDTO(n)).
		collect(Collectors.toList());
	}
	@Override
	public String deleteEmployee(Long employeeId) {
		emprepo.deleteById(employeeId);
		return "delete Succuss";
	}
	
	}
	
	


