package org.example.notificationservice.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.notificationservice.service.NotificationService;
import org.example.notificationservice.service.messageBuilder.MessageBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public abstract class AbstractEventListener<T>  implements MessageListener {
    private ObjectMapper objectMapper;
    // тут,возможно получение пользователя,фейн клиент
    private List<NotificationService> notificationServices;
    private List<MessageBuilder<T>> messageBuilders;

    @Autowired
    public  void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Autowired
    public void setNotificationServices(List<NotificationService> notificationServices) {
        this.notificationServices = notificationServices;
    }

    @Autowired
    public void setMessageBuilders (List<MessageBuilder<T>> messageBuilders){
        this.messageBuilders = messageBuilders;
    }
}
