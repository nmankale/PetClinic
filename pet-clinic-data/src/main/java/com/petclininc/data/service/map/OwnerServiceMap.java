package com.petclininc.data.service.map;

import java.util.Set;

import com.petclinic.data.model.Owner;
import com.petclininc.data.service.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Set<Owner> findAll() {
		
		return super.findAll();
	}

	@Override 
	public Owner findById(Long id) {
		
		return super.findById(id);
	}

	@Override
	public Owner save(Long id, Owner object) {
		
		return super.save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		
		super.delete(object);
	}

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	
 }
