package com.unab.ras.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.unab.ras.Collection.Vistas;
import com.unab.ras.IService.IVistasService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/view")
public class VistasController {

	@Autowired
	private IVistasService serv;

	@GetMapping
	public List<Vistas> all() {
		return serv.all();
	}

	@GetMapping("{id}")
	public Optional<Vistas> show(@PathVariable String id) {
		return serv.findById(id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Vistas save(@RequestBody Vistas vistas) {
		return serv.save(vistas);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Vistas update(@PathVariable String id, @RequestBody Vistas vistas) {
		Optional<Vistas> op = serv.findById(id);

		if (!op.isEmpty()) {

			Vistas visupdate = op.get();

			
			visupdate.setNombre(vistas.getNombre());
			visupdate.setRuta(vistas.getRuta());
			visupdate.setEstado(vistas.getEstado());

			return serv.save(visupdate);

		}

		return vistas;
	}

	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		serv.delete(id);
	}

}
