package com.example.CSR.controller;

import com.example.CSR.model.Employee;
import com.example.CSR.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    @PostMapping("/addemployee")
    public Mono<Employee> addEmployee(@RequestBody Employee employee){
        return employeeService.addemployee(employee);
    }

    @GetMapping("/findallemployee")
    public Flux<Employee> findallemployee(){
        return employeeService.findallemployee();
    }
    @GetMapping("/{employeeId}")
    public  Mono<Employee> findbyid(@PathVariable long employeeId){
        return employeeService.findbyid(employeeId);
    }
    @GetMapping("/employee/{employeeId}")
    public Mono<Employee> getEmployee(@PathVariable Long employeeId) {
        return employeeService.findbyid(employeeId)
                .flatMap(employee -> {
                    return Mono.just(employee);
                });
    }

}
