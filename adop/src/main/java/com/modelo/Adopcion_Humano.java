/**
 * 
 */
package com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name="adopcion_humano")
public class Adopcion_Humano {
	
	@Id
	@Column(name="idadopcion_humano")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="edad_anos")
	private int edad_anos;
	
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
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "persona_idpersona")
	public Persona persona;
	
	//faltan getter y setter
}
