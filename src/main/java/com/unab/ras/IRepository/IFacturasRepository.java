package com.unab.ras.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.ras.Collection.Facturas;

public interface IFacturasRepository extends MongoRepository<Facturas, String> {

}
