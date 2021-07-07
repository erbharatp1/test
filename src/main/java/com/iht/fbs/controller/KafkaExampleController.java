package com.iht.fbs.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iht.fbs.model.User;
import com.iht.fbs.service.KafkaProducerService;

@RestController
@RequestMapping(value = "/techgeeknext-kafka/")
public class KafkaExampleController {

    @Autowired
    KafkaProducerService kafkaProducer;


    @PostMapping("/producer")
    public String sendMessage(@RequestBody User user)
    {
        kafkaProducer.send(user);
        return "Message sent successfully to the Kafka topic techgeeknext-topic";
    }

}