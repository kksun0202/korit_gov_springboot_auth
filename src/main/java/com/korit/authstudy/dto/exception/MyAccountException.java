package com.korit.authstudy.dto.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
public class MyAccountException extends RuntimeException {
    private ErrorMessaage errorMessaage;

    public MyAccountException(String message) {
        super(message);
        this.errorMessaage = new ErrorMessaage(message);
    }

    @Data
    @AllArgsConstructor
    class ErrorMessaage {
        private String message;
    }
}
