package com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author rbreuer
 *
 */
@Entity
@Table(name="persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idpersona")
	private long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@NotNull
	@Column(name="nombre_usuario")
	private String nombre_usuario;
	
	@NotNull
	@Column(name="celular")
	private long celular;
	
	@NotNull
	@Column(name="password")
	private String password;
	
	// faltan setter y getter
}
