package jw.codetest.service.product.backend;

import io.eventuate.AggregateRepository;
import io.eventuate.EventuateAggregateStore;
import io.eventuate.javaclient.spring.EnableEventHandlers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.eventuate.javaclient.spring.EnableEventHandlers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories
@EnableEventHandlers
public class ProductBackendConfiguration {

    /*@Bean
    public ProductQueryWorkflow accountQueryWorkflow(AccountInfoUpdateService accountInfoUpdateService) {
        return new ProductQueryWorkflow(accountInfoUpdateService);
    }*/

    @Bean
    public ProductQueryService productQueryService(ProductRepository productRepository) {
        return new ProductQueryService(productRepository);
    }

    /*@Bean
    public QuerySideDependencyChecker querysideDependencyChecker(MongoTemplate mongoTemplate) {
        return new QuerySideDependencyChecker(mongoTemplate);
    }*/
}