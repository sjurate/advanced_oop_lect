package com.academy.controller;

import com.academy.entity.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    public MainController() {
        
    }

    @RequestMapping("/customer/all")
    public List<Customer> fetchCustomers() {
        return null;
    }

    @PostMapping("/customer/insert")
    public void insertCustomer(@RequestBody Customer customer) {
    }

    @DeleteMapping("/customer/delete/{customerId}")
    public void deleteCustomer(@PathVariable String customerId) {
    }
}