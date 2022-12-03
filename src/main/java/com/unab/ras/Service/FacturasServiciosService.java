package com.unab.ras.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.ras.Collection.FacturasServicios;
import com.unab.ras.IRepository.IFacturasServiciosRepository;
import com.unab.ras.IService.IFacturasServiciosService;

@Service
public class FacturasServiciosService implements IFacturasServiciosService {

	@Autowired
	private IFacturasServiciosRepository repo;

	@Override
	public List<FacturasServicios> all() {
		return repo.findAll();
	}

	@Override
	public Optional<FacturasServicios> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public FacturasServicios save(FacturasServicios facturasServicios) {
		return repo.save(facturasServicios);
	}

	@Override
	public void delete(String id) {
		repo.deleteById(id);
	}

}
