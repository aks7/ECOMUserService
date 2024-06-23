package dev.sandeep.UserService.exception;

public class RecordNotFoundException extends RuntimeException{
   public RecordNotFoundException(String errorMessage){
       super(errorMessage);
   }
}
