package com.saadMeddiche.findById_anti_pattern.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record PersonCreateRequest(

        @NotBlank @NotEmpty
        String firstName,

        @NotBlank @NotEmpty
        String lastName,

        @Past
        LocalDate birthDate

) {}