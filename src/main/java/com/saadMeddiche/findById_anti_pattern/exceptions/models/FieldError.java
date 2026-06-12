package com.saadMeddiche.findById_anti_pattern.exceptions.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter @Setter
public class FieldError {
    private String field;
    private String message;
    private Object rejectedValue;
}
