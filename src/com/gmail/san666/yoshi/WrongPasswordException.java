package com.gmail.san666.yoshi;

public class WrongPasswordException extends Exception{

    public WrongPasswordException(){
    }

    public WrongPasswordException(String exceptionMessage){
        super(exceptionMessage);
    }
}
