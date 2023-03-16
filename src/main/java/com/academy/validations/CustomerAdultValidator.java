package com.academy.validations;

import com.academy.exception.MandatoryValueMissingException;
import com.academy.exception.ValidationException;

public class CustomerAdultValidator extends Validator<Integer> {
    @Override
    public void validate(Integer age) {
        if(age < 18) {
            throw new ValidationException("Customer is not adult");
        }
    }

}
