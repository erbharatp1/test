package com.iht.fbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.kafka.annotation.KafkaListener;

import com.iht.fbs.model.User;

@SpringBootApplication
@EnableCaching

public class FlightBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingSystemApplication.class, args);
	}
	@KafkaListener(topics = "techgeeknext-topic", groupId = "techgeeknext-group")
    public void listen(User user) {

        System.out.println("Received User information : " + user);
    }
}
