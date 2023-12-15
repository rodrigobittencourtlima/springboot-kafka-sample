package com.bittsoftware.springbootkafkaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringbootKafkaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootKafkaProducerApplication.class, args);
    }

}
