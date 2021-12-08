package com.gmail.san666.yoshi.oopExtendsAbstract;

public class SalaryLessThanAgeException extends IllegalArgumentException{
    public SalaryLessThanAgeException(){

    }

    public SalaryLessThanAgeException(String exceptionMessage){
        super(exceptionMessage);
    }
}
