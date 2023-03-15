package com.academy.service;

import com.academy.entity.CountryCode;
import com.academy.exception.InvalidCountryCodeException;
import org.springframework.stereotype.Component;

@Component
public class CountryCodeValidator extends ValidatorT<String>{
    @Override
    public void validate(String str) {
        if(!str.isEmpty()) {
            try {
                CountryCode.valueOf(str.toUpperCase());
            } catch (IllegalArgumentException e) {
                throw new InvalidCountryCodeException("Country Code %s is not valid".formatted(str) );
            }

        }
    }


}
