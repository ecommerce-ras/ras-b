package com.unab.ras.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.unab.ras.Collection.Personas;
import com.unab.ras.IService.IPersonasService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/person")
public class PersonasController {

	@Autowired
	private IPersonasService serv;

	@GetMapping
	public List<Personas> all() {
		return serv.all();
	}

	@GetMapping("{id}")
	public Optional<Personas> show(@PathVariable String id) {
		return serv.findById(id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Personas save(@RequestBody Personas personas) {
		return serv.save(personas);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Personas update(@PathVariable String id, @RequestBody Personas personas) {
		Optional<Personas> op = serv.findById(id);

		if (!op.isEmpty()) {

			Personas perupdate = op.get();

			perupdate.setTipoDocumento(personas.getTipoDocumento());
			perupdate.setDocumentoNum(personas.getDocumentoNum());
			perupdate.setNombres(personas.getNombres());
			perupdate.setApellidos(personas.getApellidos());
			perupdate.setCorreo(personas.getCorreo());
			perupdate.setCelular(personas.getCelular());
			perupdate.setDireccion(personas.getDireccion());
			perupdate.setEstado(personas.getEstado());

			return serv.save(perupdate);

		}

		return personas;
	}

	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		serv.delete(id);
	}
}
