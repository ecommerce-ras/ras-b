package com.unab.ras.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.ras.Collection.FacturasServicios;

public interface IFacturasServiciosRepository extends MongoRepository<FacturasServicios, String> {

}
