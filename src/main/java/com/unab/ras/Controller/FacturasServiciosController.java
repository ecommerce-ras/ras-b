package com.unab.ras.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.unab.ras.Collection.FacturasServicios;
import com.unab.ras.IService.IFacturasServiciosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/factserv")
public class FacturasServiciosController {

	@Autowired
	private IFacturasServiciosService serv;

	@GetMapping
	public List<FacturasServicios> all() {
		return serv.all();
	}

	@GetMapping("{id}")
	public Optional<FacturasServicios> show(@PathVariable String id) {
		return serv.findById(id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public FacturasServicios save(@RequestBody FacturasServicios facturasServicios) {
		return serv.save(facturasServicios);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public FacturasServicios update(@PathVariable String id, @RequestBody FacturasServicios facturasServicios) {
		Optional<FacturasServicios> op = serv.findById(id);

		if (!op.isEmpty()) {

			FacturasServicios facSerupdate = op.get();

			facSerupdate.setCantidad(facturasServicios.getCantidad());
			facSerupdate.setDescuento(facturasServicios.getDescuento());
			facSerupdate.setIva(facturasServicios.getIva());
			facSerupdate.setValorBruto(facturasServicios.getValorBruto());
			facSerupdate.setValorNeto(facturasServicios.getValorNeto());

			facSerupdate.setServiciosId(facturasServicios.getServiciosId());
			facSerupdate.setFacturasId(facturasServicios.getFacturasId());

			return serv.save(facSerupdate);

		}

		return facturasServicios;
	}

	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		serv.delete(id);
	}

}
