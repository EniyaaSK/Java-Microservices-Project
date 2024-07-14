package com.example.bank_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/account")
public class AccountMapping {
    @Autowired
    public AccountService service;

    @PostMapping("/add")
    public Account order (@RequestBody Account account) {
        return service.implementsave(account);
    }
    @GetMapping("/byBeneficiary/{benId}")
    public List<Account> callByben(@PathVariable("benId") int benId){
        return service.implementFindBen(benId);
    }

    @GetMapping("/{id}")
    public Account fetchOne(@PathVariable("id") int id){
        return service.implementFindById(id);
    }
    @GetMapping("/get")
    public List<Account> viewAll() {
        return service.implementFindall();
    }
    @PutMapping("/update")
    public Account update(@RequestBody Account account){
        return service.implementsave(account) ;
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        service.implementDelete(id);
        return id+" Account has been deleted";
    }
}
