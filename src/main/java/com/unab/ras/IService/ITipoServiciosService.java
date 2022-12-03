package com.unab.ras.IService;

import java.util.List;
import java.util.Optional;

import com.unab.ras.Collection.TipoServicios;

public interface ITipoServiciosService {

	public List<TipoServicios> all();

	public Optional<TipoServicios> findById(String id);

	public TipoServicios save(TipoServicios tipoServicios);

	public void delete(String id);

}
