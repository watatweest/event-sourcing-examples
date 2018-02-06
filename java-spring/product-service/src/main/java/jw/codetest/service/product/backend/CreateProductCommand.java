package jw.codetest.service.product.backend;

import java.util.UUID;

public class CreateProductCommand implements ProductCommand {
    private String correlationId;
    private String longName;
    private String abbrev;
    private String category;

    CreateProductCommand(String longName, String abbrev, String category){
        this.correlationId = UUID.randomUUID().toString();
        this.longName = longName;
        this.abbrev = abbrev;
        this.category = category;
    }

    public String correlationId() {return correlationId; }
    public String longName() {return longName; }
    public String abbrev() {return abbrev; }
    public String category() {return category; }
}
