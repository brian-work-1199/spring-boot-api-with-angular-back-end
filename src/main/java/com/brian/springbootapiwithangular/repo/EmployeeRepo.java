package com.brian.springbootapiwithangular.repo;

import com.brian.springbootapiwithangular.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
