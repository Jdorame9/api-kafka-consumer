package com.kafka.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student implements Serializable{
    private Long id;
    private String name;
    private String rollNumber;
}
