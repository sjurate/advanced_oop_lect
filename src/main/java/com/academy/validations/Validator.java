package com.academy.validations;

public abstract class Validator <T> {
    private T t;
    public abstract void validate(T t);

}
