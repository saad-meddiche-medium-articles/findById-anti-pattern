package com.saadMeddiche.findById_anti_pattern.exceptions.customs;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public class ValidationException extends RuntimeException {

    private final HttpStatus status;

    private final String message;

}