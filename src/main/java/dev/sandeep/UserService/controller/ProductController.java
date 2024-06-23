package dev.sandeep.UserService.controller;

import dev.sandeep.UserService.dto.ProductDto;
import dev.sandeep.UserService.model.entity.Product;
import dev.sandeep.UserService.model.request.CreateProductRequest;
import dev.sandeep.UserService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/product")
    public ResponseEntity<ProductDto> createProduct(@RequestBody CreateProductRequest request){
        ProductDto createdProduct=productService.createProduct(request);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);


    }

    @GetMapping("/product/{id}")
    public ResponseEntity<ProductDto> createProduct(@PathVariable UUID id){
        ProductDto createdProduct=productService.findProductById(id);
        return new ResponseEntity<>(createdProduct, HttpStatus.OK);


    }



}
