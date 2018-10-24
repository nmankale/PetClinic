package com.petclinic.web.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.petclinic.data.model.Owner;
import com.petclinic.data.model.Vet;
import com.petclininc.data.service.OwnerService;
import com.petclininc.data.service.VetService;
import com.petclininc.data.service.map.OwnerServiceMap;
import com.petclininc.data.service.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner{

	private OwnerService ownerService;
	private VetService vetService;
	
	
	
	public DataLoader() {
		
		ownerService = new OwnerServiceMap();
		
		vetService = new VetServiceMap();
	}



	@Override
	public void run(String... args) throws Exception {
		
	// add owners
		
	Owner owner1 = new Owner();
	
	owner1.setId(1L);
	owner1.setFirstName("Nandini");
	owner1.setLastName("Mankale");
	
	ownerService.save(owner1);
	Owner owner2 = new Owner();
	owner2.setId(2L);
	owner2.setFirstName("Mihir");
	owner2.setLastName("Mankale");

	ownerService.save(owner2);
	
	System.out.println("Added Owners...");

			// Add Vet
	
	Vet vet1 = new Vet();
	
	vet1.setId(1L);
	vet1.setFirstName("Rishabh");
	vet1.setLastName("Mankale");

	vetService.save(vet1);
	
	Vet vet2 = new Vet();
	
	vet2.setId(1L);
	vet2.setFirstName("Guru");
	vet2.setLastName("Mankale");

	vetService.save(vet2);
	
	System.out.println("Added Vets...");

	}

}
