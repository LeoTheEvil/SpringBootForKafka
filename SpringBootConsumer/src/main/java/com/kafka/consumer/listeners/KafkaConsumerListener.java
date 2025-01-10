package com.kafka.consumer.listeners;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.logging.Logger;

@Configuration
public class KafkaConsumerListener {

    private Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerListener.class);

    @KafkaListener(topics = {"KafkaTest-Topic"}, groupId = "my-group-id")
    public void listener(String message) {
        LOGGER.info("Mensaje Recibido, el mensaje es: " + message);
    }
}