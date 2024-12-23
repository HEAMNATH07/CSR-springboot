package com.example.CSR.repository;

import com.example.CSR.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends ReactiveMongoRepository<Employee,Long> {
   
}
