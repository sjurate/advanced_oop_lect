package com.academy.service;

import com.academy.entity.Customer;
import com.academy.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private Validator validator;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    };

    public void insert( Customer customer) {
        validator.validate(customer);
        Customer formattedCustomer = new Customer.Builder(
                capitalizeFirstLetter(customer.getFirstName()),
                capitalizeFirstLetter(customer.getLastName()),
                formatPersonalNumber(customer))
                .withAge(customer.getAge())
                .withCountryCode(customer.getCountryCode())
                .withMartialStatus(customer.getMaritalStatus())
                .withMiddleName(customer.getMiddleName()).build();

        customerRepository.insert(formattedCustomer);

    }
    public String formatPersonalNumber(Customer customer) {
        if(customer.getPersonalNumber().length() < 4) {
            return customer.getPersonalNumber();
        } else {
            return String.valueOf(customer.getPersonalNumber().substring(0,4) + "-" + customer.getPersonalNumber().substring(4) );
        }
    }

    public String capitalizeFirstLetter(String string) {
        if(string.isEmpty()) {
            return string;
        } else {
            return string.substring(0, 1).toUpperCase() + string.substring(1);
        }
    }
    public void deleteById(String customerId) {
        customerRepository.deleteById(customerId);

    }
}
