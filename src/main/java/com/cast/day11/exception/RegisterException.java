package com.cast.day11.exception;

public class RegisterException extends Exception{
    public RegisterException(){
        super();
    }

    public RegisterException(String message){
        super(message);
    }
}