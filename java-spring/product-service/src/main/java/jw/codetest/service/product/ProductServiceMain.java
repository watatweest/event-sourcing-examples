package jw.codetest.service.product;

import io.eventuate.javaclient.driver.EventuateDriverConfiguration;
import jw.codetest.service.product.web.ProductServiceWebConfiguration;
import net.chrisrichardson.eventstore.javaexamples.banking.commonswagger.CommonSwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ProductServiceWebConfiguration.class, EventuateDriverConfiguration.class, CommonSwaggerConfiguration.class})
@EnableAutoConfiguration
@ComponentScan
public class ProductServiceMain {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceMain.class, args);
    }
}