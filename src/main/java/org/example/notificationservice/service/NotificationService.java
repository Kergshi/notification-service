package org.example.notificationservice.service;

import org.example.notificationservice.dto.UserDto;

public interface NotificationService  {

    void  send(UserDto user, String message);

}
