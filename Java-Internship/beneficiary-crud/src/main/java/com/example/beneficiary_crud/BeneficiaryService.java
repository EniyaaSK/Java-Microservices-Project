package com.example.beneficiary_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeneficiaryService {
    @Autowired
    BeneficiaryRemote remote;

    @Autowired
    FiegnCommunicator fiegnCommunicator;

    public Beneficiary implementFindByID(int id){
        Beneficiary obj = remote.findById(id).orElse(new Beneficiary());
        if(obj!=null){
            obj.setMyAccounts (fiegnCommunicator.callaccounts (obj.getBeneficiaryId ()));
        }
        return obj;
    }

    public List<Beneficiary> implementFindAll (){
        return remote.findAll();
    }

    public Beneficiary implementSave(Beneficiary beneficiary){
        return remote.save(beneficiary);
    }
    public void implementDelete(int id) {

        remote.deleteById(id);
    }
}
