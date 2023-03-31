package com.kafka.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.dto.Student;

@Controller
public class KafkaController {

    private static final Logger logger = LoggerFactory.getLogger(KafkaController.class);
    
    @KafkaListener(topics = "puntodeventa")
    public void receivedMessage(Student message) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(message);
		logger.info("Json message received using Kafka listener " + jsonString);
	}
}
