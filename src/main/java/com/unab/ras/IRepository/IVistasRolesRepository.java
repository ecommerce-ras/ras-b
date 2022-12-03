package com.unab.ras.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.ras.Collection.VistasRoles;


public interface IVistasRolesRepository extends MongoRepository<VistasRoles, String> {

}
