package com.springheaven.orderpaymentservice.repository;

import com.springheaven.orderpaymentservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
