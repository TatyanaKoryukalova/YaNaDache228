package com.gmail.san666.yoshi;

public class DoesNotContainsNumberException extends RuntimeException {
    public DoesNotContainsNumberException(){

    }

    public DoesNotContainsNumberException(String errorMessage){
        super(errorMessage);
    }
}
