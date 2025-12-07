package com.example.repository;

import com.example.entity.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

    // Custom query by price range (derived query)
    Flux<Product> findByPriceBetween(Double min, Double max);
}
