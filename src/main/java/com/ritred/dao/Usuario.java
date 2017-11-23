package com.ritred.dao;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@Column(name = "pkUsuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pkUsuario;
	
	@Basic
	@Column(name = "nombre")
	private String nombre;
	
	@Basic
	@Column(name = "username")
	private String username;
	
	@Basic
	@Column(name = "contrasena")
	private String contrasena;
	
	@Basic
	@Column(name = "email")
	private String email;
	
	@Basic
	@Column(name = "descripcion")
	private String descripcion;
	
	@Basic
	@Column(name = "ubicacion")
	private String ubicacion;
	
	@Basic
	@Column(name = "foto")
	private String foto;


	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pkTipoUsuario")
	private TipoUsuario tu;

	public Usuario() {

	}
	
	

	public TipoUsuario getTu() {
		return tu;
	}



	public void setTu(TipoUsuario tu) {
		this.tu = tu;
	}



	public int getPkUsuario() {
		return pkUsuario;
	}

	public void setPkUsuario(int pkUsuario) {
		this.pkUsuario = pkUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}


}
