package com.ms.poc.notification.msnotification.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.poc.notification.msnotification.data.model.Confirmation;
import com.ms.poc.notification.msnotification.repository.ConfirmationRepository;

@RestController
public class MSNotificationController {
	
	@Autowired
	private ConfirmationRepository confirmationRepo;
	
	
	@PostMapping("/addConfirmation")
	public void saveConfirmation(@RequestBody Confirmation confirmation) {
		confirmationRepo.save(confirmation);			
	}
	
	@GetMapping("/getConfirmation")
	public List<Confirmation> getConfirmation() {
		return confirmationRepo.findAll();			
	}
	
	@GetMapping("/getConfirmation/{id}")
	public Confirmation getOneConfirmation(@PathVariable int id) {
		 Optional<Confirmation> confirmation = confirmationRepo.findById(id);	
		 return confirmation != null ? confirmation.get() : null;
	}
	
	@DeleteMapping("/deleteConfirmation/{id}")
	public void deleteOneConfirmation(@PathVariable int id) {
		confirmationRepo.deleteById(id);			
	}
	
	@DeleteMapping("/deleteConfirmation")
	public String deleteAllConfirmation() {
		confirmationRepo.deleteAll();	
		 return "Deleted all ";
	}

}
