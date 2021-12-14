package com.gmail.san666.yoshi.oopImplementsInterfaces;

public class SalaryLessThanAgeException extends IllegalArgumentException{
    public SalaryLessThanAgeException(){

    }

    public SalaryLessThanAgeException(String exceptionMessage){
        super(exceptionMessage);
    }
}
