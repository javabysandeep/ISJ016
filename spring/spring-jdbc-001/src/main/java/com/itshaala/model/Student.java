package com.itshaala.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
}
