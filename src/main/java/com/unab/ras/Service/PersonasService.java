package com.unab.ras.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.ras.Collection.Personas;
import com.unab.ras.IRepository.IPersonasRepository;
import com.unab.ras.IService.IPersonasService;

@Service
public class PersonasService implements IPersonasService {

	@Autowired
	private IPersonasRepository repo;

	@Override
	public List<Personas> all() {
		return repo.findAll();
	}

	@Override
	public Optional<Personas> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public Personas save(Personas personas) {
		return repo.save(personas);
	}

	@Override
	public void delete(String id) {
		repo.deleteById(id);

	}

}
