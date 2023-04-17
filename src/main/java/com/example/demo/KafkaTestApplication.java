package com.example.demo;

import com.example.demo.model.Dto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaTestApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate kafkaTemplate) {
        return args -> {
            kafkaTemplate.send("name", new Dto(1L, "Rom"));
        };
    }
}
