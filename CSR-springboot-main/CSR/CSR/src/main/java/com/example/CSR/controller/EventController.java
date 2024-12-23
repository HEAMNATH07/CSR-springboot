package com.example.CSR.controller;

import com.example.CSR.model.Event;
import com.example.CSR.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;
@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("/addevent")
    public Mono<Event> createEvent(@RequestBody Event event) {

        return eventService.createEvent(event);
    }

    @GetMapping("/{id}")
    public Mono<Event> getEventDetails(@PathVariable long eventId) {

        return eventService.getEventDetails(eventId);
    }
    @GetMapping("/event/{id}")
    public Mono<Event> getEventById(@PathVariable long eventId){
        return eventService.getEventById(eventId);
    }
}
