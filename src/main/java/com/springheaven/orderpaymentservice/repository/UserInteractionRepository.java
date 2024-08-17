package com.springheaven.orderpaymentservice.repository;

import com.springheaven.orderpaymentservice.document.UserInteraction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserInteractionRepository extends MongoRepository<UserInteraction, String> {


}
