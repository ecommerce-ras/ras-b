package com.unab.ras.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("facturaservicios")
public class FacturasServicios {

	@Id
	private String id;

	@Field("cantidad")
	private Integer cantidad;

	@Field("descuento")
	private Double descuento;

	@Field("iva")
	private Double iva;

	@Field("valorbruto")
	private Double valorBruto;

	@Field("valorneto")
	private Double valorNeto;

	@DBRef
	private Servicios serviciosId;
	@DBRef
	private Facturas facturasId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
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

	public Servicios getServiciosId() {
		return serviciosId;
	}

	public void setServiciosId(Servicios serviciosId) {
		this.serviciosId = serviciosId;
	}

	public Facturas getFacturasId() {
		return facturasId;
	}

	public void setFacturasId(Facturas facturasId) {
		this.facturasId = facturasId;
	}

}
