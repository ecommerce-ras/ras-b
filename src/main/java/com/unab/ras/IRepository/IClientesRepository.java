package com.unab.ras.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.ras.Collection.Clientes;

public interface IClientesRepository extends MongoRepository<Clientes, String> {

}
