package com.ira.spring.boot.custom.validation.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmployeeTypeValidator.class)
public @interface EmployeeTypeValidation {
    public String message() default "EmployeeType should be either Permanent or Vendor";

    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
