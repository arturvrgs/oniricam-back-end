package com.oniricam.oniricam_backend.exceptions;

public class NotFoundResourceException extends RuntimeException{
    public NotFoundResourceException(String e) {
        super(e);
    }
}
