package com.unab.restaurante.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.restaurante.Collections.Roles;
public interface IRolesRepository extends MongoRepository<Roles, String>{

}
