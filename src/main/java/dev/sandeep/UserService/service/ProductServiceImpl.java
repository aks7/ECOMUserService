package dev.sandeep.UserService.service;


import dev.sandeep.UserService.dto.ProductDto;
import dev.sandeep.UserService.exception.RecordNotFoundException;
import dev.sandeep.UserService.model.entity.Product;
import dev.sandeep.UserService.model.request.CreateProductRequest;
import dev.sandeep.UserService.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ProductDto createProduct(CreateProductRequest request) {
        Product product =new Product();
        product.setId(UUID.randomUUID());
        product.setProductCost(request.getProductCost());
        product.setProductName(request.getProductName());
        product.setProductType(request.getProductType());
        Product savedProduct =productRepository.save(product);

        return modelMapper.map(savedProduct,ProductDto.class);
    }

    @Override
    public ProductDto findProductById(UUID id) {

       Optional<Product> productOptional= productRepository.findById(id);
      if( productOptional.isPresent()){
          return modelMapper.map(productOptional.get(),ProductDto.class);

      }else{
          throw new RecordNotFoundException("Record Not Found");
      }
    }


}
