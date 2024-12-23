package com.example.CSR.repository;

import com.example.CSR.model.School;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends ReactiveMongoRepository<School,Long> {
}
