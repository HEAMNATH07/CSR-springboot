package com.example.CSR.services;

import com.example.CSR.model.School;
import com.example.CSR.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    public Mono<School> createSchool(School school) {
        return schoolRepository.save(school);
    }

    public Flux<School> findallSchool(){
        return schoolRepository.findAll();
    }

    public Mono<School> getSchoolById(long schoolId) {
        return schoolRepository.findById(schoolId);
    }


}
