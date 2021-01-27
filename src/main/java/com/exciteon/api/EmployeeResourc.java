package com.exciteon.api;

import com.exciteon.modal.Employee;
import com.exciteon.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class EmployeeResourc {
    @Autowired
    private EmployeeService employeeService;
    //  create new User
    @PostMapping("/save")
    public String saveUserDetails(@RequestBody Employee user){
        return employeeService.createUser(user);
    }

    //  get all users
    @CrossOrigin
    @GetMapping("/get")
    private List<Employee> getAllPost() throws ExecutionException, InterruptedException {
        return employeeService.getAllEmployee();
    }
}
