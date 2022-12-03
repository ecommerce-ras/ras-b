package com.unab.ras.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.ras.Collection.UsuariosRas;
import com.unab.ras.IRepository.IUsuariosRasRepository;
import com.unab.ras.IService.IUsuariosRasService;

@Service
public class UsuariosRasService implements IUsuariosRasService {

	@Autowired
	private IUsuariosRasRepository repo;

	@Override
	public List<UsuariosRas> all() {
		return repo.findAll();
	}	

	@Override
	public Optional<UsuariosRas> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public UsuariosRas save(UsuariosRas usuarios) {
		return repo.save(usuarios);
	}

	@Override
	public void delete(String id) {
		repo.deleteById(id);
	}


	

}
