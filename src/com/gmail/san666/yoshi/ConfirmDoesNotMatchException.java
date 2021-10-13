package com.gmail.san666.yoshi;

public class ConfirmDoesNotMatchException extends Exception{
    public ConfirmDoesNotMatchException(){

    }

    public ConfirmDoesNotMatchException(String exceptionMessage){
        super(exceptionMessage);
    }
}

