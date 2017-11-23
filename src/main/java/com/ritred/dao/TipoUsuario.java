package com.ritred.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "tipousuario", uniqueConstraints = { @UniqueConstraint(columnNames = "pkTipoUsuario")})
public class TipoUsuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8682408040172934552L;
	
	@Id
	@Column(name = "pkTipoUsuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pkTipoUsuario;
	private String nombre;

	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tu")
	private List<Usuario> usuarios;
	


	public TipoUsuario() {
	}

	
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}


	
	public int getPkTipoUsuario() {
		return pkTipoUsuario;
	}

	public void setPkTipoUsuario(int pkTipoUsuario) {
		this.pkTipoUsuario = pkTipoUsuario;
	}

	@Basic
	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
