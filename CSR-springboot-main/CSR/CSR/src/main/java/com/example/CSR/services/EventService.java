package com.example.CSR.services;

import com.example.CSR.model.Event;
import com.example.CSR.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Mono<Event> createEvent(Event event) {

        return eventRepository.save(event);
    }

    public Mono<Event> getEventDetails(long eventId) {

        return eventRepository.findById(eventId);
    }

    public Mono<Event> getEventById(long eventId) {
        return eventRepository.findById(eventId)
                .flatMap(event -> {
                    return Mono.just(event);
                });
    }
}
