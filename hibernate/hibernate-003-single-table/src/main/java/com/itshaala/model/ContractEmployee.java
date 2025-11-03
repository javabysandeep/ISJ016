package com.itshaala.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@DiscriminatorValue("c2h")
@Entity
public class ContractEmployee extends Employee {
    private int invoiceAmount;
}
