package com.itshaala.model;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class FullTimeEmployee extends Employee {
    private int salary;
}
