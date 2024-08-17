package com.springheaven.orderpaymentservice.service;


import com.springheaven.orderpaymentservice.document.ProductCache;
import com.springheaven.orderpaymentservice.document.UserInteraction;
import com.springheaven.orderpaymentservice.entity.Order;
import com.springheaven.orderpaymentservice.entity.Payment;
import com.springheaven.orderpaymentservice.repository.OrderRepository;
import com.springheaven.orderpaymentservice.repository.PaymentRepository;
import com.springheaven.orderpaymentservice.repository.ProductCacheRepository;
import com.springheaven.orderpaymentservice.repository.UserInteractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class EcommerceService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private UserInteractionRepository userInteractionRepository;

    @Autowired
    private ProductCacheRepository productCacheRepository;



    public void createOrderAndPayment(Long customerId, BigDecimal amount) {
        // Create order
        Order order = new Order();
        order.setCustomerId(customerId);
        order.setOrderDate(LocalDateTime.now());
        order.setTotalAmount(amount);
        order.setStatus("NEW");
        order = orderRepository.save(order);

        // Create payment
        Payment payment = new Payment();
        payment.setOrderId(order.getId());
        payment.setPaymentDate(LocalDateTime.now());
        payment.setPaymentMethod("Credit Card");
        payment.setAmount(amount);
        payment.setStatus("COMPLETED");
        paymentRepository.save(payment);
    }


    public void logUserInteraction(Long userId, String action, String productId) {
        UserInteraction interaction = new UserInteraction();
        interaction.setUserId(userId);
        interaction.setTimestamp(LocalDateTime.now());
        interaction.setAction(action);
        interaction.setProductId(productId);
        userInteractionRepository.save(interaction);
    }

    public void cacheProductDetails(String productId, String name, double price, String availability) {
        ProductCache productCache = new ProductCache();
        productCache.setId(productId);
        productCache.setName(name);
        productCache.setPrice(price);
        productCache.setAvailability(availability);
        productCacheRepository.save(productCache);
    }


}
