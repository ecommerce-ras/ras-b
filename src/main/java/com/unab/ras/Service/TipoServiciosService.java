package com.unab.ras.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.ras.Collection.TipoServicios;
import com.unab.ras.IRepository.ITipoServiciosRepository;
import com.unab.ras.IService.ITipoServiciosService;

@Service
public class TipoServiciosService implements ITipoServiciosService {

	@Autowired
	private ITipoServiciosRepository repo;

	@Override
	public List<TipoServicios> all() {
		return repo.findAll();
	}

	@Override
	public Optional<TipoServicios> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public TipoServicios save(TipoServicios tipoServicios) {
		return repo.save(tipoServicios);
	}

	@Override
	public void delete(String id) {
		repo.deleteById(id);

	}

}
