package com.atos.demo.crud.repository;

import com.atos.demo.crud.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  // We don need to create the methods, JpaRepository already does it for us.
}
