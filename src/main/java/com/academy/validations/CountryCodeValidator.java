package com.academy.validations;

import com.academy.entity.CountryCode;
import com.academy.exception.InvalidCountryCodeException;
import com.academy.exception.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class CountryCodeValidator extends Validator<String>{
    @Override
    public void validate(String str) {
        if(!str.isEmpty()) {
            try {
                CountryCode.valueOf(str.toUpperCase());
            } catch (IllegalArgumentException e) {
                throw new ValidationException("Country Code %s is not valid".formatted(str) );
            }

        }
    }


}
