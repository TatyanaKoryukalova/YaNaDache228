package com.gmail.san666.yoshi;

public class ConfirmDoesNotMatch extends Exception{
    public ConfirmDoesNotMatch(){

    }

    public ConfirmDoesNotMatch(String exceptionMessage){
        super(exceptionMessage);
    }
}
