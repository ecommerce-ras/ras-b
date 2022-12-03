package com.unab.ras.IService;

import java.util.List;
import java.util.Optional;

import com.unab.ras.Collection.Vistas;

public interface IVistasService {
	
	public List <Vistas> all();
	
	public Optional<Vistas> findById(String id);
	
	public Vistas save(Vistas vistas);
	
	public void delete(String id);
	
	

}
