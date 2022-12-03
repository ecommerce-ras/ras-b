package com.unab.ras.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.ras.Collection.Facturas;
import com.unab.ras.IRepository.IFacturasRepository;
import com.unab.ras.IService.IFacturasService;

@Service
public class FacturasService implements IFacturasService {

	@Autowired
	private IFacturasRepository repo;

	@Override
	public List<Facturas> all() {
		return repo.findAll();
	}

	@Override
	public Optional<Facturas> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public Facturas save(Facturas facturas) {
		return repo.save(facturas);
	}

	@Override
	public void delete(String id) {
		repo.deleteById(id);
	}

}
