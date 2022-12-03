package com.unab.ras.IService;

import java.util.List;
import java.util.Optional;

import com.unab.ras.Collection.Servicios;

public interface IServiciosService {

	public List<Servicios> all();

	public Optional<Servicios> findById(String Id);

	public Servicios save(Servicios servicios);

	public void delete(String id);

}
