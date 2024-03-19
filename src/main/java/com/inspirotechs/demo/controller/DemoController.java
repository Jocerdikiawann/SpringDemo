package com.inspirotechs.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.inspirotechs.demo.entity.Employee;
import com.inspirotechs.demo.repository.EmployeeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/api/employees")
    List<Employee> all() {
        return repository.findAll();
    }

    @GetMapping("/")
    public String getMessageDemo() {
        return "Hello ! This is a demo message from the server.";
    }

}
