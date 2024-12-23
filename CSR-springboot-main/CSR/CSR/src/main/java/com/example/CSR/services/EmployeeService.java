package com.example.CSR.services;

import com.example.CSR.model.Employee;
import com.example.CSR.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;
    

    public Mono<Employee> addemployee(Employee employee){
        return repo.save(employee);
    }
    public Flux<Employee> findallemployee(){
        return repo.findAll();
    }
    public Mono<Employee> findbyid(long employeeId){
        return repo.findById(employeeId);
    }
    


}
