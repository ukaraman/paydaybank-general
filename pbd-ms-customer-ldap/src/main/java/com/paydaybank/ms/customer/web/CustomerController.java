package com.paydaybank.ms.customer.web;


import com.paydaybank.ms.customer.domain.Customer;
import com.paydaybank.ms.customer.domain.CustomerDTO;
import com.paydaybank.ms.customer.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody CustomerDTO customerDTO){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomerService.create(authentication.getName() , customerDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/summary")
    public ResponseEntity<List<Customer>> summary(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        List<Customer> customerList = customerService.getActivecustomerList(authentication.getName());
        return ResponseEntity.ok(customerList);
    }

}
