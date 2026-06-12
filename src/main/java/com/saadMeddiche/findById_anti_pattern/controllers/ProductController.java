package com.saadMeddiche.findById_anti_pattern.controllers;

import com.saadMeddiche.findById_anti_pattern.requests.ProductCreateRequest;
import com.saadMeddiche.findById_anti_pattern.services.ProductCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductCreateService productCreateService;

    @PostMapping
    public void createProduct(@RequestBody ProductCreateRequest createRequest){
         this.productCreateService.createProduct(createRequest);
    }

}