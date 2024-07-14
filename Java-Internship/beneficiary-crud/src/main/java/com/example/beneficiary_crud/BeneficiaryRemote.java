package com.example.beneficiary_crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiaryRemote extends JpaRepository<Beneficiary,Integer> {
}
