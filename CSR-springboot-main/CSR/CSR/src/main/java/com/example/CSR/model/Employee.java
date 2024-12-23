package com.example.CSR.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    public  long employeeId;
    public  String Name;
    public String  willing;

    @DBRef
    private List<Event> events;
}
