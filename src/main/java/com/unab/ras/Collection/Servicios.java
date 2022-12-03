package com.unab.ras.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("servicios")
public class Servicios {

	@Id
	private String id;

	@Field("nombre")
	private String nombre;

	@Field("valorunutario")
	private Double valorUnitario;

	@Field("tiempoentrega")
	private String tiempoEntrega;

	@Field("descripcion")
	private String descripcion;

	@Field("imagen")
	private String imagen;

	@Field("estado")
	private Boolean estado;

	@DBRef
	private TipoServicios tipoServiciosId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public String getTiempoEntrega() {
		return tiempoEntrega;
	}

	public void setTiempoEntrega(String tiempoEntrega) {
		this.tiempoEntrega = tiempoEntrega;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public TipoServicios getTipoServiciosId() {
		return tipoServiciosId;
	}

	public void setTipoServiciosId(TipoServicios tipoServiciosId) {
		this.tipoServiciosId = tipoServiciosId;
	}

}
