package com.saadMeddiche.findById_anti_pattern.requests;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record ProductCreateRequest(

        @NotBlank @NotEmpty
        String name,

        @NotBlank @NotEmpty
        String description,

        @NotNull @Min(0)
        BigDecimal price,

        @NotNull
        Long ownerId

) {}