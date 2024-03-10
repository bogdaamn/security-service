package com.task.securityservice.exceptions;

public class ExtensionNotAllowedException extends RuntimeException {

    public ExtensionNotAllowedException(String message) {
        super(message);
    }
}