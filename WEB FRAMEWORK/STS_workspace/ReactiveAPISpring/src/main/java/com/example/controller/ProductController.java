package com.example.controller;

import com.example.entity.Product;
import com.example.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // 1. Retrieve all products
    @GetMapping
    public Flux<Product> getAll() {
        return service.getAll();
    }

    // 2. Retrieve a single product by ID
    @GetMapping("/{id}")
    public Mono<ResponseEntity<Product>> getById(@PathVariable String id) {
        return service.getById(id)
                .map(p -> ResponseEntity.ok(p))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    // 3. Create a new product
    @PostMapping
    public Mono<ResponseEntity<Product>> create(@RequestBody Product product) {
        return service.create(product)
                .map(saved -> ResponseEntity.status(HttpStatus.CREATED).body(saved));
    }

    // 4. Update an existing product
    @PutMapping("/{id}")
    public Mono<ResponseEntity<Product>> update(@PathVariable String id,
                                                @RequestBody Product product) {
        return service.update(id, product)
                .map(updated -> ResponseEntity.ok(updated))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    // 5. Delete a product
    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Void>> delete(@PathVariable String id) {
        return service.delete(id)
                .then(Mono.just(ResponseEntity.noContent().<Void>build()));
    }

    // 6. Retrieve products within a specified price range
    @GetMapping("/price-range")
    public Flux<Product> getByPriceRange(@RequestParam Double min,
                                         @RequestParam Double max) {
        return service.getByPriceRange(min, max);
    }
}
