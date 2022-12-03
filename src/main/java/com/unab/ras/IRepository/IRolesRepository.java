package com.unab.ras.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.ras.Collection.Roles;

public interface IRolesRepository extends MongoRepository<Roles, String> {

}
