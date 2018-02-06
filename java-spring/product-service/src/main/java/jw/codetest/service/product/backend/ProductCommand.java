package jw.codetest.service.product.backend;

import io.eventuate.Command;

public interface ProductCommand extends Command {
    String correlationId();
}

