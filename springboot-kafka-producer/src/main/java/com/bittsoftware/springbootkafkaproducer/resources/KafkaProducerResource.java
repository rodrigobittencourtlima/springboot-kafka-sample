package com.bittsoftware.springbootkafkaproducer.resources;

import com.bittsoftware.springbootkafkaproducer.kafka.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class KafkaProducerResource {

    private final TopicProducer topicProducer;

    @PostMapping(value = "/send")
    public void send() {
        topicProducer.send("Mensagem de teste enviada ao tópico");
    }
}