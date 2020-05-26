package com.rapport.generateur.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="TYPE_RESSOURCE_DONNEES")
public class TypeRessourceDonnees implements Serializable {
       @OneToMany(mappedBy = "typeRessourceDonneesIdFk")
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="TYPE_RESSOURCE_DONNEES_ID")
	private Long typeRessourceDonneesId;
     @Column(name="LIBELLE")
    private String typeRessourceDonneesLibelle;
     
     /** **********Getters and Setters ******************** **/
	public Long getTypeRessourceDonneesId() {
		return typeRessourceDonneesId;
	}
	public void setTypeRessourceDonneesId(Long typeRessourceDonneesId) {
		this.typeRessourceDonneesId = typeRessourceDonneesId;
	}
	public String getTypeRessourceDonneesLibelle() {
		return typeRessourceDonneesLibelle;
	}
	public void setTypeRessourceDonneesLibelle(String typeRessourceDonneesLibelle) {
		this.typeRessourceDonneesLibelle = typeRessourceDonneesLibelle;
	}
	/** ********Enumeration*********** **/
	
	@Enumerated(EnumType.STRING)
	private TypeDeRessource typeDeRessource;
	
	/** *************Constructor**************** **/
	public TypeRessourceDonnees(String typeRessourceDonneesLibelle) {
		super();
		this.typeRessourceDonneesLibelle = typeRessourceDonneesLibelle;
	}
	public TypeRessourceDonnees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
     
     
}
