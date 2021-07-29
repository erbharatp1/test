package com.iht.fbs.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.iht.fbs.model.Flight;

@Configuration
public class KafkaProducerConfiguration {
	
	
	@Bean
	public ProducerFactory<String, Flight> producerFactory(){		
		Map<String,Object> properties = new HashMap<>();		
		properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"127.0.0.1:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,JsonSerializer.class);		
		return new DefaultKafkaProducerFactory(properties);		
	}		
	
	@Bean
	public KafkaTemplate<String, Flight> kafkaTemplate(){		
		return new KafkaTemplate<>(producerFactory());		
	}
}