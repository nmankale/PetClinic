package com.petclininc.data.service;

import java.util.Set;

import com.petclinic.data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);
}
