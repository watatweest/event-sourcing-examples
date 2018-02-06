package jw.codetest.service.product.backend;

import java.util.Optional;

public class ProductQueryService {
    private ProductRepository productRepository;

    public ProductQueryService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<Product> findByProductId(String productId) {
        Product product = productRepository.findOne(productId);
        if (product == null)
            return Optional.empty();
        else
            return Optional.of(product);
    }
}