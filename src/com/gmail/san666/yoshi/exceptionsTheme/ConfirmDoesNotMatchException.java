package com.gmail.san666.yoshi.exceptionsTheme;

public class ConfirmDoesNotMatchException extends Exception{
    public ConfirmDoesNotMatchException(){

    }

    public ConfirmDoesNotMatchException(String exceptionMessage){
        super(exceptionMessage);
    }
}

