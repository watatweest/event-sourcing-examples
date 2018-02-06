package jw.codetest.service.product.backend;

import java.util.UUID;

public class DeleteProductCommand implements ProductCommand {
    private String correlationId;
    private String productId;

    DeleteProductCommand(String productId){
        this.correlationId = UUID.randomUUID().toString();
        this.productId = productId;
    }

    public String correlationId(){return correlationId;}
    public String productId(){return productId;}
}
