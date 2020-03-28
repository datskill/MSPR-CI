package com.preudhomme.erp.back.exception;

public class UserException extends RuntimeException {
    public UserException (String message) {
        super("Could not find user pass in parameters : " + message);
    }
}
