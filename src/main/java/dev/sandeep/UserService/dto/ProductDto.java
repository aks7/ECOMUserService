package dev.sandeep.UserService.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class ProductDto {
   private UUID id;
   private String productName;
   private String productCost;
   private String productType;
}
