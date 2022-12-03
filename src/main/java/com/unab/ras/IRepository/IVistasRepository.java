package com.unab.ras.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.ras.Collection.Vistas;

public interface IVistasRepository extends MongoRepository<Vistas, String> {

}
