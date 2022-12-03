package com.unab.ras.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("vistasroles")
public class VistasRoles {

	@Id
	private String id;

	@DBRef
	private Roles rolesId;
	
	// @Field("nombrevr")
	// private String nombrevr;
	
	@DBRef
	private Vistas vistasId;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Roles getRolesId() {
		return rolesId;
	}

	public void setRolesId(Roles rolesId) {
		this.rolesId = rolesId;
	}


	public Vistas getVistasId() {
		return vistasId;
	}

	public void setVistasId(Vistas vistasId) {
		this.vistasId = vistasId;
	}

	

}
