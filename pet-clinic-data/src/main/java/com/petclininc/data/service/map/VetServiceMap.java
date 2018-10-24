package com.petclininc.data.service.map;

import java.util.Set;

import com.petclinic.data.model.Vet;
import com.petclininc.data.service.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Set<Vet> findAll() {
		
		return super.findAll();
	}

	@Override 
	public Vet findById(Long id) {
		
		return super.findById(id);
	}

	@Override
	public Vet save(Long id, Vet object) {
		
		return super.save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		
		super.delete(object);
	}

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}

	
 }
