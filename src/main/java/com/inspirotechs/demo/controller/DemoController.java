package com.inspirotechs.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.inspirotechs.demo.entity.Employee;
import com.inspirotechs.demo.repository.EmployeeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DemoController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/api/employees")
    List<Employee> all() {
        return repository.findAll();
    }

    @PostMapping("/api/employees")
    public Employee saveEmployee(@RequestBody Employee entity) {
        return repository.save(entity);
    }

    @DeleteMapping("/api/employee")
    public String deleteEmployee(@RequestParam Long id) {
        try {
            if (repository.existsById(id))
                repository.deleteById(id);
            else
                throw new IllegalArgumentException("Employee not found");
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
        return "Delete Success";
    }

    @GetMapping("/")
    public String getMessageDemo() {
        return "Hello ! This is a demo message from the server.";
    }

}
