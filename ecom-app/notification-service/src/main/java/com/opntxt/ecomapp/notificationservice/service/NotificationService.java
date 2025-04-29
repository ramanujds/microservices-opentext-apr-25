package com.opntxt.ecomapp.notificationservice.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private static final Logger log = LoggerFactory.getLogger(NotificationService.class);

    @KafkaListener(topics = "order-topic", groupId = "order-notification-group")
    public void sendNotification(ConsumerRecord<String, String> record) {
        log.info("Sending notification: {}", record.value());
    }

}
