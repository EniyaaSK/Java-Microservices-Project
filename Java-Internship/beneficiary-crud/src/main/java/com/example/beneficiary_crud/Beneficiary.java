package com.example.beneficiary_crud;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Beneficiary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int beneficiaryId;
    private int accountNumber;
    private String beneficiaryName;
    private String ifscCode;
    transient private List<Account> myAccounts;

//    public void setMyaccount(List<Account> callaccounts) {
//    }
}

