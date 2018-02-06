package jw.codetest.service.product.backend;

import io.eventuate.DispatchedEvent;
import io.eventuate.EventHandlerMethod;
import io.eventuate.EventSubscriber;
import io.eventuate.Int128;
import net.chrisrichardson.eventstore.javaexamples.banking.backend.common.accounts.*;
import net.chrisrichardson.eventstore.javaexamples.banking.backend.common.transactions.CreditRecordedEvent;
import net.chrisrichardson.eventstore.javaexamples.banking.backend.common.transactions.DebitRecordedEvent;
import net.chrisrichardson.eventstore.javaexamples.banking.backend.common.transactions.FailedDebitRecordedEvent;
import net.chrisrichardson.eventstore.javaexamples.banking.backend.common.transactions.MoneyTransferCreatedEvent;
import net.chrisrichardson.eventstore.javaexamples.banking.common.accounts.AccountChangeInfo;
import net.chrisrichardson.eventstore.javaexamples.banking.common.accounts.AccountTransactionInfo;
import net.chrisrichardson.eventstore.javaexamples.banking.common.transactions.TransferState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.BigDecimal;

//@EventSubscriber(id="querySideEventHandlers")
public class ProductQueryWorkflow {
    /*
    private Logger logger = LoggerFactory.getLogger(getClass());

    private ProductService productService;

    public ProductQueryWorkflow(ProductService productService) {
        this.productService = productService;
    }

    @EventHandlerMethod
    public void create(DispatchedEvent<Create> de) {
        AccountOpenedEvent event = de.getEvent();
        String id = de.getEntityId();
        Int128 eventId = de.getEventId();
        logger.info("**************** account version={}, {}", id, eventId);
        BigDecimal initialBalance = event.getInitialBalance();

        String customerId = event.getCustomerId();
        String title = event.getTitle();
        String description = event.getDescription();

        accountInfoUpdateService.create(id, customerId, title, initialBalance, description, eventId);
    }

    @EventHandlerMethod
    public void delete(DispatchedEvent<AccountDeletedEvent> de) {
        String id = de.getEntityId();
        accountInfoUpdateService.delete(id);
    }
    */
}