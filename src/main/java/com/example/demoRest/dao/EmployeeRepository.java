package com.example.demoRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoRest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
