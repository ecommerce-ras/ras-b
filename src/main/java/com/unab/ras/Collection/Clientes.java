package com.unab.ras.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("clientes")
public class Clientes {

	@Id
	private String id;

	@Field("codigo")
	private String codigo;

	@Field("estado")
	private boolean estado;

	@DBRef
	private UsuariosRas usuarioId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public UsuariosRas getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(UsuariosRas usuarioId) {
		this.usuarioId = usuarioId;
	}

}