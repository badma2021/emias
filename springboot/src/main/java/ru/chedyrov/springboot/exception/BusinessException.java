package ru.chedyrov.springboot.exception;

public class BusinessException extends RuntimeException{
    private static final Long serialVersionUID=1l;
    public BusinessException(String msg) {
        super(msg);
    }
}
