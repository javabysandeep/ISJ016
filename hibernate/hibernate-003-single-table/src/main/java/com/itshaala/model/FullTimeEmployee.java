package com.itshaala.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@DiscriminatorValue("fte")
@Entity
public class FullTimeEmployee extends Employee{
    private int salary;
}
