package com.example.beneficiary_crud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name ="Feign-Interceptor" ,url = "http://localhost:1234/account")
public interface FiegnCommunicator {

    @GetMapping("/byBeneficiary/{benId}")
    public List<Account> callaccounts(@PathVariable("benId") int Id);

//    List<Account> callaccounts(int accountNumber);
}
