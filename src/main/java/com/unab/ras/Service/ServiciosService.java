package com.unab.ras.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.ras.Collection.Servicios;
import com.unab.ras.IRepository.IServiciosRepository;
import com.unab.ras.IService.IServiciosService;

@Service
public class ServiciosService implements IServiciosService {

	@Autowired
	private IServiciosRepository repo;

	@Override
	public List<Servicios> all() {
		return repo.findAll();
	}

	@Override
	public Optional<Servicios> findById(String Id) {
		return repo.findById(Id);
	}

	@Override
	public Servicios save(Servicios servicios) {
		return repo.save(servicios);
	}

	@Override
	public void delete(String id) {
		repo.deleteById(id);
	}

}
