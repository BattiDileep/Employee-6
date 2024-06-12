package com.example.Employee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee.Entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long>{

}
