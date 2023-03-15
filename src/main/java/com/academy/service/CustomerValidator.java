package com.academy.service;

import com.academy.entity.CountryCode;
import com.academy.entity.Customer;
import com.academy.exception.InvalidCountryCodeException;
import com.academy.exception.MandatoryValueMissingException;
import org.springframework.stereotype.Component;

@Component
public class CustomerValidator {

    private MandatoryCustomerValuesValidator mandatoryCustomerValuesValidator = new MandatoryCustomerValuesValidator();
    private  CustomerAdultValidator customerAdultValidator = new CustomerAdultValidator();
    private CountryCodeValidator countryCodeValidator = new CountryCodeValidator();

    public void validate(Customer customer) {
        mandatoryCustomerValuesValidator.validate(customer);
        customerAdultValidator.validate(customer.getAge());
        countryCodeValidator.validate(customer.getCountryCode());

    }
}
