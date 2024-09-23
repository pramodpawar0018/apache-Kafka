package com.example.demo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Customer;

@Service
public class KafkaMessageListener {
	
	Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);
	
	
	@KafkaListener(topics = "pawar-demo-json", groupId = "pp-group-1" )
	public void consume(Customer customer) {
		log.info("Consumer consume the Events {}", customer.toString());
	}
//	
//	@KafkaListener(topics = "pawar-demo-1", groupId = "pp-group" )
//	public void consume2(String message) {
//		log.info("Consumer2 consume the message {}", message);
//	}
//	
//	@KafkaListener(topics = "pawar-demo-1", groupId = "pp-group" )
//	public void consume3(String message) {
//		log.info("Consumer3 consume the message {}", message);
//	}
//	
//	@KafkaListener(topics = "pawar-demo-1", groupId = "pp-group" )
//	public void consume4(String message) {
//		log.info("Consumer4 consume the message {}", message);
//	}
	
	
}
