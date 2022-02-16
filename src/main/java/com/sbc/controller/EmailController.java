package com.sbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.sbc.entity.Email;
import com.sbc.service.EmailService;

@RestController
@RequestMapping("/email")
public class EmailController {

	@Autowired
	EmailService eservice;
	
	// consume Kakfa Messages asynchronously
	@KafkaListener(topics = "KafkaTopic1001", groupId = "foo")
	public void listenKafkaMessages(String stringMessage) {
		// convert String (JSON) to JavaObject  
        Gson gson = new Gson();  
        Email email = gson.fromJson(stringMessage, Email.class);  
        sendEmail(email);
	    System.out.println("Received Kafka Message: " + stringMessage);
	}
	
	
	@PostMapping(path="/send", consumes="application/json")
	public void sendEmail(@RequestBody Email email) {
		eservice.sendEmail(email);
	}
	
	@GetMapping(path="/get/{id}", produces="application/json")
	public Email sendEmail(@PathVariable int id) {
		return eservice.getEmail(id);
	}
}
