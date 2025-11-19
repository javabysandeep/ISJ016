package com.itshaala.springboot006crudproject.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class EmployeeDto {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private double salary;

}
