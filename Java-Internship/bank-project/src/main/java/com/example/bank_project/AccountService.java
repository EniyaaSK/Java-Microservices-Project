package com.example.bank_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRemote remote;

    public List<Account> implementFindBen(int benId) {
        return remote.findAllByBeneficiaryId(benId);

    }
    public Account implementFindById(int accountId){
        return remote.findById(accountId).orElse(new Account());
    }

    public void implementDelete(int id) {

        remote.deleteById(id);
    }

    public List<Account> implementFindall() {
        return remote.findAll();
    }

    public Account implementsave(Account account) {

        return remote.save(account);
    }

}
