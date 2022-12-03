package com.unab.ras.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.unab.ras.Collection.Servicios;
import com.unab.ras.IService.IServiciosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/servicio")
public class ServiciosController {

	@Autowired
	private IServiciosService serv;

	@GetMapping
	public List<Servicios> all() {
		return serv.all();
	}

	@GetMapping("{id}")
	public Optional<Servicios> show(@PathVariable String id) {
		return serv.findById(id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Servicios save(@RequestBody Servicios servicios) {
		return serv.save(servicios);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Servicios update(@PathVariable String id, @RequestBody Servicios servicios) {
		Optional<Servicios> op = serv.findById(id);

		if (!op.isEmpty()) {

			Servicios servupdate = op.get();

			
			servupdate.setNombre(servicios.getNombre());
			servupdate.setValorUnitario(servicios.getValorUnitario());
			servupdate.setTiempoEntrega(servicios.getTiempoEntrega());
			servupdate.setDescripcion(servicios.getDescripcion());
			servupdate.setImagen(servicios.getImagen());
			servupdate.setEstado(servicios.getEstado());

			servupdate.setTipoServiciosId(servicios.getTipoServiciosId());
			return serv.save(servupdate);

		}

		return servicios;
	}

	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		serv.delete(id);
	}

}
