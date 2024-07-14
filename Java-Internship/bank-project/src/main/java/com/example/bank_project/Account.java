package com.example.bank_project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Account {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountNumber;
    private Long accountBalance;
    private String accountHolder;
    private int  beneficiaryId;

}
