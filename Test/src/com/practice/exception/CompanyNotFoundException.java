package com.practice.exception;

public class CompanyNotFoundException extends RuntimeException{
    public CompanyNotFoundException(String company_not_found) {
        super(company_not_found);
    }
}
