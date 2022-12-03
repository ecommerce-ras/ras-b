package com.unab.ras.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.ras.Collection.VistasRoles;
import com.unab.ras.IRepository.IVistasRolesRepository;
import com.unab.ras.IService.IVistasRolesService;

@Service
public class VistasRolesService implements IVistasRolesService {

	@Autowired
	private IVistasRolesRepository repo;

	@Override
	public List<VistasRoles> all() {
		return repo.findAll();
	}

	@Override
	public Optional<VistasRoles> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public VistasRoles save(VistasRoles vistasRoles) {
		return repo.save(vistasRoles);
	}

	@Override
	public void delete(String id) {
		repo.deleteById(id);
	}

}
