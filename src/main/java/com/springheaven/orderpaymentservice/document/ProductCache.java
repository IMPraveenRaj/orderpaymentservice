package com.springheaven.orderpaymentservice.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "productCache")
public class ProductCache {
    @Id
    private String id;
    private String name;
    private double price;
    private String availability;

    // Getters and Setters
}