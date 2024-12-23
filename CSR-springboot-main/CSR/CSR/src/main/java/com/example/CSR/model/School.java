package com.example.CSR.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.w3c.dom.events.Event;

import java.util.List;

@Document(collection = "School")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class School {
    @Id
    public long schoolId;
    public String name;
    @DBRef
    public List<Event> events;


}
