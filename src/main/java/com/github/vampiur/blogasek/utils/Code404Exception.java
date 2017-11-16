package com.github.vampiur.blogasek.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class Code404Exception extends RuntimeException {
    public Code404Exception(String message) {
        super(message);
    }

    public Code404Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Code404Exception(Throwable cause) {
        super(cause);
    }

    public Code404Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
