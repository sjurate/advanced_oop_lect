package com.academy.service;

public abstract class Validator <T> {
    private T t;
    public abstract void validate(T t);

}
