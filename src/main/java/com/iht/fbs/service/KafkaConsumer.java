package com.iht.fbs.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.iht.fbs.model.Flight;

@Service
public class KafkaConsumer {

	@Autowired
	FlightService flightService;

	@KafkaListener(topics = "airline_topic", groupId = "airlinegroup", containerFactory = "kafkaListenerContainerFactory")
	public void consumeAirlineMessage(@Payload Flight flight, @Headers MessageHeaders headers) throws IOException {
		System.out.println("Entered KAFKA-CONSUMER : consumeAirlineMessage : " + flight.toString());
		if (flight != null) {
		flightService.save(flight);
		}
//		if(savedAirline != null) {
//			Locations_airlineids loc_Air = new Locations_airlineids(savedAirline.getDeparture(),savedAirline.getDestination(),savedAirline.getId()+"");
//			System.out.println(loc_Air.toString());			
//			locationAirlineService.saveLocations_airlineids(loc_Air);
//			System.out.println("Saved Airline Data...!");
//		}
	}
}