package com.unab.ras.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.unab.ras.Collection.Facturas;
import com.unab.ras.IService.IFacturasService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/fact")
public class FacturasController {

	@Autowired
	private IFacturasService serv;

	@GetMapping
	public List<Facturas> all() {
		return serv.all();
	}

	@GetMapping("{id}")
	public Optional<Facturas> show(@PathVariable String id) {
		return serv.findById(id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Facturas save(@RequestBody Facturas facturas) {
		return serv.save(facturas);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Facturas update(@PathVariable String id, @RequestBody Facturas facturas) {
		Optional<Facturas> op = serv.findById(id);

		if (!op.isEmpty()) {

			Facturas facupdate = op.get();
			
			facupdate.setNumFactura(facturas.getNumFactura());
			facupdate.setFecha(facturas.getFecha());
			facupdate.setDescuento(facturas.getDescuento());
			facupdate.setIva(facturas.getIva());
			facupdate.setValorBruto(facturas.getValorBruto());
			facupdate.setValorNeto(facturas.getValorNeto());
			facupdate.setMedioPago(facturas.getMedioPago());
			facupdate.setEstado(facturas.getEstado());

			facupdate.setClienteId(facturas.getClienteId());

			return serv.save(facupdate);

		}

		return facturas;
	}

	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		serv.delete(id);
	}
}
