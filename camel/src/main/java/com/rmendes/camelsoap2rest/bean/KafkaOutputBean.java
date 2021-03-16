package com.rmendes.camelsoap2rest.bean;

import com.rmendes.camelsoap2rest.model.Notification;
import org.codehaus.jackson.map.ObjectMapper;

public class KafkaOutputBean {

	public void doWork(String body) {
		System.out.println("KafkaBody result >>>>> " + this.retrieve(body));
	}

	public Notification retrieve(String body) {
		Notification message;
		try {
			message = new ObjectMapper().readValue(body, Notification.class);
		} catch (Exception e) {
			message = new Notification();
		}
		return message;
	}
}
