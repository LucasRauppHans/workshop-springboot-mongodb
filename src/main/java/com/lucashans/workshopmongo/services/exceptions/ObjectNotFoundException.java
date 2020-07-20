package com.lucashans.workshopmongo.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

    private static final float serialVersionUID = 1L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
