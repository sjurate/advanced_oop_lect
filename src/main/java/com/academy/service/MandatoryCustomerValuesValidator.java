package com.academy.service;

import com.academy.entity.Customer;
import com.academy.exception.MandatoryValueMissingException;

public class MandatoryCustomerValuesValidator extends ValidatorT<Customer> {

    @Override
    public void validate(Customer customer) {
        if(customer.getPersonalNumber().isBlank()) {
            throw new MandatoryValueMissingException("Missing personal number");
        }
        if(customer.getFirstName().isBlank()) {
            throw new MandatoryValueMissingException("Missing first name");

        }
        if(customer.getLastName().isBlank()) {
            throw new MandatoryValueMissingException("Missing last name");

        }


    }
}
