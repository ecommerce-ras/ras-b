package com.unab.ras.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.unab.ras.Collection.Roles;
import com.unab.ras.IService.IRolesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/rol")
public class RolesController {

	@Autowired
	private IRolesService serv;

	@GetMapping
	public List<Roles> all() {
		return serv.all();
	}

	@GetMapping("{id}")
	public Optional<Roles> show(@PathVariable String id) {
		return serv.findById(id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Roles save(@RequestBody Roles roles) {
		return serv.save(roles);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Roles update(@PathVariable String id, @RequestBody Roles roles) {
		Optional<Roles> op = serv.findById(id);

		if (!op.isEmpty()) {

			Roles rolupdate = op.get();

			rolupdate.setNombre(roles.getNombre());
			rolupdate.setEstado(roles.getEstado());

			return serv.save(rolupdate);

		}

		return roles;
	}

	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		serv.delete(id);
	}

}
