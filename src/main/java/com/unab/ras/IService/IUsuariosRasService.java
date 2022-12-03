package com.unab.ras.IService;

import java.util.List;
import java.util.Optional;

import com.unab.ras.Collection.UsuariosRas;

public interface IUsuariosRasService {

	public List<UsuariosRas> all();

	public Optional<UsuariosRas> findById(String id);

	public UsuariosRas save(UsuariosRas usuarios);

	public void delete(String id);


}
