package com.unab.ras.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.ras.Collection.TipoServicios;

public interface ITipoServiciosRepository extends MongoRepository<TipoServicios, String> {

}
