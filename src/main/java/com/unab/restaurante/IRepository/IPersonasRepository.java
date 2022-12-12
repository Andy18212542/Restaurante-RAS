package com.unab.restaurante.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.restaurante.Collections.Personas;

public interface IPersonasRepository extends MongoRepository<Personas, String>{

}
