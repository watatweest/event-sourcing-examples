package jw.codetest.service.product.backend;

import io.eventuate.ReflectiveMutableCommandProcessingAggregate;
import java.time.Instant;

public class Product extends ReflectiveMutableCommandProcessingAggregate<Product, ProductCommand> {
    public static final int ABBREV_MAX_LEN = 3;
    private String productLongName;
    private char productAbbrev[] = new char[ABBREV_MAX_LEN];
    private String productCategory;
    private Instant activeDate;

}