/*
 * package com.iht.fbs.service; import
 * org.springframework.kafka.annotation.KafkaListener; import
 * org.springframework.stereotype.Service;
 * 
 * import com.iht.fbs.model.Flight;
 * 
 * @Service public final class ConsumerService {
 * 
 * @KafkaListener(topics = "kafkaTopic", groupId = "group_id") public void
 * consume(Flight message) {
 * System.out.println("Received Messasge in group - group-id: " + message); } }
 */