package com.ms.poc.notification.msnotification.resource;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.poc.notification.msnotification.data.model.SafeStore;
import com.ms.poc.notification.msnotification.repository.SafeStoreRepository;

@RestController
public class MSNotificationController {
	
	@Autowired
	private SafeStoreRepository safeStoreRepository;
	
	
	@PostMapping("/addSafeStore")
	public String saveSafeStore(@RequestBody SafeStore safeStore) {
		safeStoreRepository.save(safeStore);	
		return "Added" + safeStore.getId();
	}
	
	@GetMapping("/getSafeStore")
	public String getSafeStore() {
		Optional<SafeStore> findById = safeStoreRepository.findById(101);	
		return "Added" + findById.get().getId();
	}

}
