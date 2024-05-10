package com.brian.springbootapiwithangular.repo;

import com.brian.springbootapiwithangular.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    public void deleteEmployeeById(Long id);
    public Optional<Employee> findEmployeeById(Long id);

}
