package jw.codetest.service.product.backend;

import io.eventuate.AggregateRepository;
import io.eventuate.EntityWithIdAndVersion;

import java.util.concurrent.CompletableFuture;

public class ProductService {
    private final AggregateRepository<Product, ProductCommand> aggregateRepository;

    public ProductService(AggregateRepository<Product, ProductCommand> aggregateRepository) {
        this.aggregateRepository = aggregateRepository;
    }

    public CompletableFuture<EntityWithIdAndVersion<Product>> createProduct(String longName, String abbrev, String category) {
        return aggregateRepository.save(new CreateProductCommand(longName, abbrev, category));
    }
}