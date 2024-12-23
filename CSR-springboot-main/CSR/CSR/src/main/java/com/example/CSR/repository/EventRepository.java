package com.example.CSR.repository;

import com.example.CSR.model.Event;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends ReactiveMongoRepository<Event,Long> {
}
