package dev.sandeep.UserService.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "product_details")
public class Product {
    @Id
    private UUID id;
    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private String productCost;
    @Column(nullable = false)
    private String productType;
}
