package com.brian.springbootapiwithangular.service;

import com.brian.springbootapiwithangular.exception.UserNotFoundException;
import com.brian.springbootapiwithangular.repo.EmployeeRepo;
import com.brian.springbootapiwithangular.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployee(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id){
        return employeeRepo.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("User by id" + id + " was not found"));
    }

    public void deleteEmployee(long id){
        employeeRepo.deleteEmployeeById(id);
    }
}
