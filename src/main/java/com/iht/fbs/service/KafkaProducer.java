package com.iht.fbs.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.iht.fbs.model.Flight;

@Service
public class KafkaProducer {
	
	private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);

	public static final String topic = "airline_topic";
	
	@Autowired
	private KafkaTemplate<String,Flight> kafkaTemp;
	
	
	public void sendAirlineMessage(Flight airline) {
		log.info("sendAirlineMessage ::: "+airline.toString());
		
		kafkaTemp.send(topic, airline);
	}
}