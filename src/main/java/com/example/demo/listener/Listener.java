package com.example.demo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(topics = "name", groupId = "groupId")
    void listener(String str){
        for (int i = 0; i < 10; i++) {
            System.out.println("Receive data " + str + " 🥰 " + i);
        }
    }
}
