package com.therealdanvega.exception;


public class PostNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -3235095004706025765L;

    public PostNotFoundException(String msg) {
        super(msg);
    }
}
