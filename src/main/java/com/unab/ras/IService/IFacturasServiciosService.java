package com.unab.ras.IService;

import java.util.List;
import java.util.Optional;

import com.unab.ras.Collection.FacturasServicios;

public interface IFacturasServiciosService {

	public List<FacturasServicios> all();

	public Optional<FacturasServicios> findById(String id);

	public FacturasServicios save(FacturasServicios facturasServicios);

	public void delete(String id);

}
