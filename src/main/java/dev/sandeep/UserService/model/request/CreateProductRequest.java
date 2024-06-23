package dev.sandeep.UserService.model.request;

import lombok.Data;

@Data
public class CreateProductRequest {

    private String productName;
    private String productCost;
    private String productType;
}
