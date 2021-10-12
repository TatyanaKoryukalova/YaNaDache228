package com.gmail.san666.yoshi;

public class NumberIsTooLongException extends Exception {
    public NumberIsTooLongException(){

    }

    public NumberIsTooLongException(String errorMessage){
        super(errorMessage);
    }
}
