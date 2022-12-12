package com.unab.restaurante.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.restaurante.Collections.Usuarios;

public interface IUsuariosRepository extends MongoRepository<Usuarios, String>{

}
