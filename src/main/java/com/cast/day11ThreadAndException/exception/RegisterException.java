package com.cast.day11ThreadAndException.exception;

public class RegisterException extends Exception{
    public RegisterException(){
        super();
    }

    public RegisterException(String message){
        super(message);
    }
}
