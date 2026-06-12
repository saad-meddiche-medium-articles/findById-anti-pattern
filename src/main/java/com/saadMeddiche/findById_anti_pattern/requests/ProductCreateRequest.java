package com.saadMeddiche.findById_anti_pattern.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductCreateRequest(

        @NotBlank @NotEmpty
        String name,

        @NotBlank @NotEmpty
        String description,

        @NotNull @Min(0)
        BigDecimal price

) {}