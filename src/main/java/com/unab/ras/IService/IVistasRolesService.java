package com.unab.ras.IService;

import java.util.List;
import java.util.Optional;

import com.unab.ras.Collection.VistasRoles;

public interface IVistasRolesService {

	public List<VistasRoles> all();

	public Optional<VistasRoles> findById(String id);

	public VistasRoles save(VistasRoles vistasRoles);

	public void delete(String id);

}
