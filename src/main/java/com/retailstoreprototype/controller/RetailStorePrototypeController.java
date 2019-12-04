package com.retailstoreprototype.controller;
import com.retailstoreprototype.model.Amount;
import com.retailstoreprototype.model.Customer;
import com.retailstoreprototype.service.RetailStorePrototypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RetailStorePrototypeController 
{
    private RetailStorePrototypeService prototypeService;
    @Autowired
    public  RetailStorePrototypeController(RetailStorePrototypeService prototypeService)
    {
       this.prototypeService = prototypeService;
    }
    @PostMapping
    @RequestMapping("/discount")
    public ResponseEntity<Amount> netPayable(@RequestBody Customer customer)
    {
       Amount amount = prototypeService.start(customer);
       System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
       return ResponseEntity.ok(amount);
    }
}