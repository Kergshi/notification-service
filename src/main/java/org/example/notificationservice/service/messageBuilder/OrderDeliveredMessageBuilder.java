package org.example.notificationservice.service.messageBuilder;

import lombok.RequiredArgsConstructor;
import org.example.notificationservice.dto.OrderDeliveredEvent;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@RequiredArgsConstructor
public class OrderDeliveredMessageBuilder implements MessageBuilder<OrderDeliveredEvent> {
    private final MessageSource messageSource;

    @Override
    public String buildMessage(OrderDeliveredEvent event, Locale userLocale) {
        return messageSource.getMessage("order_delivered.new", null, userLocale);
    }

    @Override
    public Class<?> supportsEventType() {
        return OrderDeliveredEvent.class;
    }
}
