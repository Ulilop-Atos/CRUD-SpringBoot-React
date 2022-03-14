package com.atos.demo.crud.controller;

import java.util.List;

import com.atos.demo.crud.model.Employee;
import com.atos.demo.crud.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EmployeeController
 */
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

  @Autowired
  private EmployeeRepository employeeRepository;

  @GetMapping("/employees")
  public List<Employee> getAllEmployees() {
    System.out.println(employeeRepository.findAll());
    return employeeRepository.findAll();
  }
}