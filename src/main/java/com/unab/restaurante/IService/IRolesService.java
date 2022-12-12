package com.unab.restaurante.IService;

import java.util.List;
import java.util.Optional;

import com.unab.restaurante.Collections.Roles;

public interface IRolesService {

	public List<Roles> all();
	
	public Optional<Roles> findById(String id);
	
	public Roles save(Roles roles);
	
	public void delete(String id);
}
