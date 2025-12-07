package com.example.service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public Flux<Product> getAll() {
        return repo.findAll();
    }

    public Mono<Product> getById(String id) {
        return repo.findById(id);
    }

    public Mono<Product> create(Product product) {
        product.setId(null);
        return repo.save(product);
    }

    public Mono<Product> update(String id, Product product) {
        return repo.findById(id)
                .flatMap(existing -> {
                    existing.setName(product.getName());
                    existing.setDescription(product.getDescription());
                    existing.setPrice(product.getPrice());
                    return repo.save(existing);
                });
    }

    public Mono<Void> delete(String id) {
        return repo.deleteById(id);
    }

    public Flux<Product> getByPriceRange(Double min, Double max) {
        return repo.findByPriceBetween(min, max);
    }
}
