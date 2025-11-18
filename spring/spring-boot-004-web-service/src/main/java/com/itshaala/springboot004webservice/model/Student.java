package com.itshaala.springboot004webservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
}
