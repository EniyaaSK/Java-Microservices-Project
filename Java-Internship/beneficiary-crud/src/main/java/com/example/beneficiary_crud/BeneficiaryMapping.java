package com.example.beneficiary_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beneficiary")
public class BeneficiaryMapping {
    @Autowired
    BeneficiaryService service;

    @PostMapping("/add")
    public Beneficiary callSave(@RequestBody Beneficiary beneficiary) {
        return service.implementSave(beneficiary);
    }

    @GetMapping("/{id}")
    public Beneficiary callOne(@PathVariable("id") int id){
        return service.implementFindByID(id) ;
    }

    @GetMapping("/")
    public List<Beneficiary> callFetch(){
        return service.implementFindAll();
    }
    @PutMapping("/update")
    public Beneficiary update(@RequestBody Beneficiary beneficiary){
        return service.implementSave (beneficiary) ;
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        service.implementDelete(id);
        return id+" BeneficiaryId has been deleted";
    }
}
