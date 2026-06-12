package com.saadMeddiche.findById_anti_pattern.services;

import com.saadMeddiche.findById_anti_pattern.entitites.Person;
import com.saadMeddiche.findById_anti_pattern.repositories.PersonRepository;
import com.saadMeddiche.findById_anti_pattern.requests.PersonCreateRequest;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class PersonCreateService {

    private final PersonRepository personRepository;

    private final Validator validator;

    public void createPerson(PersonCreateRequest createRequest) {

        this.validateCreateRequest(createRequest);

        Person person = this.mapToPerson(createRequest);

        this.personRepository.save(person);

    }

    private void validateCreateRequest(PersonCreateRequest createRequest) {

        Set<ConstraintViolation<PersonCreateRequest>> violations = this.validator.validate(createRequest);

        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }

    }

    private Person mapToPerson(PersonCreateRequest createRequest) {

        Person person = new Person();

        person.setFirstName(createRequest.firstName());
        person.setLastName(createRequest.lastName());
        person.setBirthDate(createRequest.birthDate());

        return person;

    }

}