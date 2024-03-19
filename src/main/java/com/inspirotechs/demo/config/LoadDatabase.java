package com.inspirotechs.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.inspirotechs.demo.entity.Employee;
import com.inspirotechs.demo.repository.EmployeeRepository;

@Component
public class LoadDatabase implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public void run(String... args) throws Exception {
        for (Employee employee : repository.findAll()) {
            System.out.println("Preloaded " + employee.getName());
        }
    }

}