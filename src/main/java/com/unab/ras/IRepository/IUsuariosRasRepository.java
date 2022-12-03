package com.unab.ras.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.ras.Collection.UsuariosRas;

public interface IUsuariosRasRepository extends MongoRepository<UsuariosRas, String> {

}
