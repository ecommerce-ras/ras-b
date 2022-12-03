package com.unab.ras.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.unab.ras.Collection.UsuariosRas;
import com.unab.ras.IService.IUsuariosRasService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/usr")
public class UsuariosRasController {

	@Autowired
	private IUsuariosRasService serv;

	@GetMapping
	public List<UsuariosRas> all() {
		return serv.all();
	}

	@GetMapping("{id}")
	public Optional<UsuariosRas> show(@PathVariable String id) {
		return serv.findById(id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public UsuariosRas save(@RequestBody UsuariosRas usuarios) {
		return serv.save(usuarios);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public UsuariosRas update(@PathVariable String id, @RequestBody UsuariosRas usuarios) {
		Optional<UsuariosRas> op = serv.findById(id);

		if (!op.isEmpty()) {

			UsuariosRas Userupdate = op.get();

			
			Userupdate.setUsuario(usuarios.getUsuario());
			Userupdate.setImagen(usuarios.getImagen());
			Userupdate.setContrasenia(usuarios.getContrasenia());
			Userupdate.setEstado(usuarios.getEstado());

			Userupdate.setRolId(usuarios.getRolId());
			Userupdate.setPersonaId(usuarios.getPersonaId());

			return serv.save(Userupdate);

		}

		return usuarios;
	}

	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		serv.delete(id);
	}

}
