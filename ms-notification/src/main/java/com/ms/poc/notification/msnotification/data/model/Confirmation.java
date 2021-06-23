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
@Document(collection = "confirmation")
public class Confirmation {		
	@Id
	private String id;
	private String requestDateTime;
	private String requestMessageId;
	private String collectionUpdatedDateTime;
	private String confStatus;
	private String confirmationDateTime;
	private String messageDesc;
	private String messageStatusDateTime;
	private String optionalFields;
	private String origPaymentAmount;
	private String originalValueDate;
	private String paymentAmount;
}
