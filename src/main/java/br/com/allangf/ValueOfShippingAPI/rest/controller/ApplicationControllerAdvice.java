package br.com.allangf.ValueOfShippingAPI.rest.controller;

import br.com.allangf.ValueOfShippingAPI.domain.exception.RuleOfException;
import br.com.allangf.ValueOfShippingAPI.rest.ApiErrors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationControllerAdvice {

    @ExceptionHandler(RuleOfException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handleRuleOfException(RuleOfException ex) {
        String errorMessage = ex.getMessage();
        return new ApiErrors(errorMessage);
    }
}
