package com.example.bank_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRemote extends JpaRepository <Account ,Integer> {
    List<Account> findAllByBeneficiaryId(int benId );
}