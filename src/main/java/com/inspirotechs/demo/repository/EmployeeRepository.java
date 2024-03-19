package com.inspirotechs.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.inspirotechs.demo.entity.Employee;

/**
 * EmployeeRepository
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
