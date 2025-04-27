package com.micro.product.exceptions;

import com.micro.product.dto.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleProductNotFoundException(
            ProductNotFoundException productNotFoundException, HttpServletRequest httpServletRequest){
        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                productNotFoundException.getMessage(),
                httpServletRequest.getRequestURI());

        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }

}
