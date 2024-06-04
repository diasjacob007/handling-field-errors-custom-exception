package com.ira.spring.boot.custom.validation.annotation;

import java.util.Arrays;
import java.util.List;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmployeeTypeValidator implements ConstraintValidator<EmployeeTypeValidation, String> {
    @Override
    public boolean isValid(String employeeType, ConstraintValidatorContext context) {
        List<String> employeeTypes = Arrays.asList("Permanent", "Vendor");
        return employeeTypes.contains(employeeType);
    }
}
