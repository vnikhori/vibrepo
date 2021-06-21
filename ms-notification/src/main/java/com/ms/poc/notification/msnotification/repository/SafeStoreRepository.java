package com.ms.poc.notification.msnotification.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ms.poc.notification.msnotification.data.model.SafeStore;

public interface SafeStoreRepository extends MongoRepository<SafeStore, Integer> {

}
