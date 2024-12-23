package com.example.CSR.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Event")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    @Id
    private long eventId;
    private String name;
    private String date;

    @DBRef
    private School school;
    @DBRef
    private List<Employee> participants;
}
