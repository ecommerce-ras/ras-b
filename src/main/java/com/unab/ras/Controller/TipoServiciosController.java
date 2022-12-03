package com.unab.ras.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.unab.ras.Collection.TipoServicios;
import com.unab.ras.IService.ITipoServiciosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/tipservice")
public class TipoServiciosController {

	@Autowired
	private ITipoServiciosService serv;

	@GetMapping
	public List<TipoServicios> all() {
		return serv.all();
	}

	@GetMapping("{id}")
	public Optional<TipoServicios> show(@PathVariable String id) {
		return serv.findById(id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public TipoServicios save(@RequestBody TipoServicios tipoServicios) {
		return serv.save(tipoServicios);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public TipoServicios update(@PathVariable String id, @RequestBody TipoServicios tipoServicios) {
		Optional<TipoServicios> op = serv.findById(id);

		if (!op.isEmpty()) {

			TipoServicios tipoSerupdate = op.get();

			
			tipoSerupdate.setNombre(tipoServicios.getNombre());
			tipoSerupdate.setDescripcion(tipoServicios.getDescripcion());
			tipoSerupdate.setImagen(tipoServicios.getImagen());
			tipoSerupdate.setEstado(tipoServicios.getEstado());

			return serv.save(tipoSerupdate);

		}

		return tipoServicios;
	}

	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		serv.delete(id);
	}

}
