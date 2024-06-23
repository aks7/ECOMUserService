package dev.sandeep.UserService.service;

import dev.sandeep.UserService.dto.ProductDto;
import dev.sandeep.UserService.model.entity.Product;
import dev.sandeep.UserService.model.request.CreateProductRequest;
import org.springframework.stereotype.Service;
import java.util.UUID;


public interface ProductService {

    ProductDto createProduct(CreateProductRequest request);

    ProductDto findProductById(UUID id);

}
