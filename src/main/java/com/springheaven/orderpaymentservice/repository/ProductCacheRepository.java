package com.springheaven.orderpaymentservice.repository;


import com.springheaven.orderpaymentservice.document.ProductCache;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCacheRepository extends MongoRepository<ProductCache, String> {
}
