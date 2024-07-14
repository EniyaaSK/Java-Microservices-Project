package com.example.beneficiary_crud;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private int accountNumber;
    private Long accountBalance;
    private String accountHolder;
    private int  beneficiaryId;
}
