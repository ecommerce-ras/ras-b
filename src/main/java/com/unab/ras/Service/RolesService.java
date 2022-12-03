package com.unab.ras.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.ras.Collection.Roles;
import com.unab.ras.IRepository.IRolesRepository;
import com.unab.ras.IService.IRolesService;

@Service
public class RolesService implements IRolesService {

	@Autowired
	private IRolesRepository repo;

	@Override
	public List<Roles> all() {
		return repo.findAll();
	}

	@Override
	public Optional<Roles> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public Roles save(Roles roles) {
		return repo.save(roles);
	}

	@Override
	public void delete(String id) {
		repo.deleteById(id);

	}

}
