package com.example.exceptionHandling.exception;

public class ResourceNotFoundException extends RuntimeException {
   public ResourceNotFoundException(String message){
       super(message);
   }
}
