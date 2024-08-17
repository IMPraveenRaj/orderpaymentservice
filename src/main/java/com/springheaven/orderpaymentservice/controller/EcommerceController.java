package com.springheaven.orderpaymentservice.controller;


import com.springheaven.orderpaymentservice.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api")
public class EcommerceController {

    @Autowired
    private EcommerceService ecommerceService;

    @PostMapping("/order")
    public void createOrder(@RequestParam Long customerId, @RequestParam BigDecimal amount) {
        ecommerceService.createOrderAndPayment(customerId, amount);
    }

    @PostMapping("/user-interaction")
    public void logUserInteraction(@RequestParam Long userId, @RequestParam String action, @RequestParam String productId) {
        ecommerceService.logUserInteraction(userId, action, productId);
    }

    @PostMapping("/cache-product")
    public void cacheProduct(@RequestParam String productId, @RequestParam String name, @RequestParam double price, @RequestParam String availability) {
        ecommerceService.cacheProductDetails(productId, name, price, availability);
    }
}