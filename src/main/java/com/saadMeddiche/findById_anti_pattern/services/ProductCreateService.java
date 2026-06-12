package com.saadMeddiche.findById_anti_pattern.services;

import com.saadMeddiche.findById_anti_pattern.entitites.Product;
import com.saadMeddiche.findById_anti_pattern.repositories.ProductRepository;
import com.saadMeddiche.findById_anti_pattern.requests.ProductCreateRequest;
import com.saadMeddiche.findById_anti_pattern.utils.FastUUID;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class ProductCreateService {

    private final ProductRepository productRepository;

    private final Validator validator;

    public void createProduct(ProductCreateRequest createRequest) {

        this.validateCreateRequest(createRequest);

        Product product = this.mapToProduct(createRequest);

        this.productRepository.save(product);

    }

    private void validateCreateRequest(ProductCreateRequest createRequest) {

        Set<ConstraintViolation<ProductCreateRequest>> violations = this.validator.validate(createRequest);

        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }

    }

    private Product mapToProduct(ProductCreateRequest createRequest) {

        Product product = new Product();

        product.setName(createRequest.name());
        product.setDescription(createRequest.description());
        product.setPrice(createRequest.price());
        product.setSerial(FastUUID.randomUUID());

        return product;

    }

}