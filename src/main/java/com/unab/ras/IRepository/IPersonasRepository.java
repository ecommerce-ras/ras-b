package com.unab.ras.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.ras.Collection.Personas;

public interface IPersonasRepository extends MongoRepository<Personas, String> {

}
