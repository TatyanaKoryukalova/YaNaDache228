package com.gmail.san666.yoshi.exceptionsTheme;

public class WrongPasswordException extends Exception{

    public WrongPasswordException(){
    }

    public WrongPasswordException(String exceptionMessage){
        super(exceptionMessage);
    }
}
