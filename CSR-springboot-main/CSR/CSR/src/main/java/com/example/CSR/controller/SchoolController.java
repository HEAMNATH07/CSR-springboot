package com.example.CSR.controller;

import com.example.CSR.model.School;
import com.example.CSR.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/schools")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping("/addschool")
    public Mono<School> addschool(@RequestBody School school){
        return schoolService.createSchool(school);
    }
    @GetMapping("/findallschool")
    public Flux<School> findallschool(){
        return schoolService.findallSchool();
    }
    @GetMapping("/{schoolId}")
    public Mono<School> findbyid(@PathVariable long schoolId){
        return  schoolService.getSchoolById(schoolId);
    }
    @GetMapping("/school/{schoolId}")
    public Mono<School> getSchool(@PathVariable Long schoolId) {
        return schoolService.getSchoolById(schoolId)
                .flatMap(school -> {
                    return Mono.just(school);
                });
    }
}
