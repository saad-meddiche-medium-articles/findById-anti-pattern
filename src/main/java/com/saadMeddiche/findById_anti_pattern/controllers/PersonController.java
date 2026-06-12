package com.saadMeddiche.findById_anti_pattern.controllers;

import com.saadMeddiche.findById_anti_pattern.requests.PersonCreateRequest;
import com.saadMeddiche.findById_anti_pattern.services.PersonCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonCreateService personCreateService;

    @PostMapping
    public void createPerson(@RequestBody PersonCreateRequest createRequest) {
        this.personCreateService.createPerson(createRequest);
    }

}