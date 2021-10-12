package com.gmail.san666.yoshi;

public class WrongLoginException extends Exception {

    public WrongLoginException(){
    }

    public WrongLoginException(String exceptionMessage){
        super(exceptionMessage);
    }
}
