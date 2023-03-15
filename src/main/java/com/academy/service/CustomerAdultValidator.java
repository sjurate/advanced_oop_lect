package com.academy.service;

import com.academy.exception.MandatoryValueMissingException;

public class CustomerAdultValidator extends ValidatorT<Integer> {
    @Override
    public void validate(Integer age) {
        if(age < 18) {
            throw new MandatoryValueMissingException("Customer is not adult");
        }
    }

}
