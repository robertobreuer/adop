package com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author rbreuer
 *
 */
@Entity
@Table(name="adopcion_animal")
public class Adopcion_Animal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull
	@Column(name="raza")
	private String raza;
	
	@Column(name="edad_dias")
	private long edad_dias;
	
	@Column(name="discapacidad")
	private String discapacidad;
	
	@NotNull
	@Column(name="latitud")
	private double latitud;
	
	@NotNull
	@Column(name="longitud")
	private double longitud;
	
	@NotNull
	@Column(name="direccion")
	private String direccion;
	
	@OneToOne
	@JoinColumn(name="persona_idpersona")
	public Persona persona;
	
	// faltan setter y getter
}
