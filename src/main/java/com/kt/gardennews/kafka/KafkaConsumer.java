package com.kt.gardennews.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "garden-topic")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
