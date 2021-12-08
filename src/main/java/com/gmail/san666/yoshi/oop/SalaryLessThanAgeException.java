package com.gmail.san666.yoshi.oop;

public class SalaryLessThanAgeException extends IllegalArgumentException{
    public SalaryLessThanAgeException(){

    }

    public SalaryLessThanAgeException(String exceptionMessage){
        super(exceptionMessage);
    }
}
