package com.ira.spring.boot.custom.validation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "User name shouldn't be null")
    private String name;
    @Email(message = "Provide a valid email")
    private String email;
    @Pattern(regexp = "^\\d{10}$", message = "Please provide a valid mobile number")
    private String mobile;
    private String gender;
    @Min(value = 18, message = "Minimum allowed age is 18")
    @Max(value = 60, message = "Maximum allowed age is 60")
    private int age;
    @NotBlank(message = "Please provide the nationality")
    private String nationality;
}
