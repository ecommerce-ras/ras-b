package com.unab.ras.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.ras.Collection.Vistas;
import com.unab.ras.IRepository.IVistasRepository;
import com.unab.ras.IService.IVistasService;

@Service
public class VistasService implements IVistasService {
	
	@Autowired
	private IVistasRepository repo;

	@Override
	public List<Vistas> all() {
		return repo.findAll();
	}

	@Override
	public Optional<Vistas> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public Vistas save(Vistas vistas) {
		return repo.save(vistas);
	}

	@Override
	public void delete(String id) {
		repo.deleteById(id);
		
	}

}
