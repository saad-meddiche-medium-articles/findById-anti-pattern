package com.saadMeddiche.findById_anti_pattern.controllers;

import com.saadMeddiche.findById_anti_pattern.requests.ProductCreateRequest;
import com.saadMeddiche.findById_anti_pattern.services.ProductClassicCreateService;
import com.saadMeddiche.findById_anti_pattern.services.ProductReferenceCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductClassicCreateService productClassicCreateService;

    @PostMapping("/classic")
    public void createProductClassic(@RequestBody ProductCreateRequest createRequest) {
         this.productClassicCreateService.createProduct(createRequest);
    }

    private final ProductReferenceCreateService productReferenceCreateService;

    @PostMapping("/reference")
    public void createProductReference(@RequestBody ProductCreateRequest createRequest) {
        this.productReferenceCreateService.createProduct(createRequest);
    }

}