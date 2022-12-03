package com.unab.ras.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.unab.ras.Collection.Clientes;
import com.unab.ras.IService.IClientesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/client")
public class ClientesController {

	@Autowired
	private IClientesService service;

	@GetMapping
	public List<Clientes> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<Clientes> show(@PathVariable String id) {
		return service.findById(id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Clientes save(@RequestBody Clientes clientes) {
		return service.save(clientes);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Clientes update(@PathVariable String id, @RequestBody Clientes clientes) {
		Optional<Clientes> op = service.findById(id);

		if (!op.isEmpty()) {

			Clientes clientesUpdate = op.get();

			clientesUpdate.setCodigo(clientes.getCodigo());
			clientesUpdate.setUsuarioId(clientes.getUsuarioId());
			clientesUpdate.setEstado(clientes.getEstado());

			return service.save(clientesUpdate);
		}

		return clientes;
	}

	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
