package com.springheaven.orderpaymentservice.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@Document(collection = "userInteractions")
public class UserInteraction {
    @Id
    private String id;
    private Long userId;
    private LocalDateTime timestamp;
    private String action;
    private String productId;

    // Getters and Setters
}