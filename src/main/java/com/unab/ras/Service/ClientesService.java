package com.unab.ras.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.ras.Collection.Clientes;
import com.unab.ras.IRepository.IClientesRepository;
import com.unab.ras.IService.IClientesService;

@Service
public class ClientesService implements IClientesService {

	@Autowired
	private IClientesRepository repository;

	@Override
	public List<Clientes> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Clientes> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Clientes save(Clientes categorias) {
		return repository.save(categorias);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}
}
