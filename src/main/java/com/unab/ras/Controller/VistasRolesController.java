package com.unab.ras.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.unab.ras.Collection.VistasRoles;
import com.unab.ras.IService.IVistasRolesService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/vistaroles")
public class VistasRolesController {

	@Autowired
	private IVistasRolesService serv;

	@GetMapping
	public List<VistasRoles> all() {
		return serv.all();
	}

	@GetMapping("{id}")
	public Optional<VistasRoles> show(@PathVariable String id) {
		return serv.findById(id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public VistasRoles save(@RequestBody VistasRoles vistasRoles) {
		return serv.save(vistasRoles);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public VistasRoles update(@PathVariable String id, @RequestBody VistasRoles vistasRoles) {
		Optional<VistasRoles> op = serv.findById(id);

		if (!op.isEmpty()) {

			VistasRoles vrUpdate = op.get();
			
			vrUpdate.setRolesId(vistasRoles.getRolesId());
			vrUpdate.setVistasId(vistasRoles.getVistasId());
			

			return serv.save(vrUpdate);

		}

		return vistasRoles;
	}

	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		serv.delete(id);
	}

}
