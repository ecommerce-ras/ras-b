package com.unab.ras.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("facturas")
public class Facturas {

	@Id
	private String id;

	@Field("numfactura")
	private String numFactura;

	@Field("fecha")
	private String fecha;

	@Field("descuento")
	private Double descuento;

	@Field("iva")
	private Double iva;

	@Field("valorbruto")
	private Double valorBruto;

	@Field("valorneto")
	private Double valorNeto;

	@Field("mediopago")
	private String medioPago;

	@Field("estado")
	private Boolean estado;

	@DBRef
	private Clientes ClienteId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public Double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(Double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public Double getValorNeto() {
		return valorNeto;
	}

	public void setValorNeto(Double valorNeto) {
		this.valorNeto = valorNeto;
	}

	public String getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Clientes getClienteId() {
		return ClienteId;
	}

	public void setClienteId(Clientes clienteId) {
		ClienteId = clienteId;
	}

}
