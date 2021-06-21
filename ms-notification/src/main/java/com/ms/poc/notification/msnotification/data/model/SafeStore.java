package com.ms.poc.notification.msnotification.data.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Document(collection = "SafeStore")
public class SafeStore {
	
	@Id
	private int id;
	private String name;
	

}
