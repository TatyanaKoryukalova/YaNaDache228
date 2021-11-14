package com.gmail.san666.yoshi.oopExtendsAbstract;

public class salaryLessThanAgeException extends Exception{
    public salaryLessThanAgeException(){

    }

    public salaryLessThanAgeException(String exceptionMessage){
        super(exceptionMessage);
    }
}
