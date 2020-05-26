package com.rapport.generateur.entities;

import java.io.Serializable;
import java.util.List;

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
@Table(name="TYPE_DONNEES")
public class TypeDonnees implements Serializable {
	
	/*
	 * @OneToMany(mappedBy = "typeDonneesIdFk") private List<TypeDonnees>
	 * listTypeDonnees;
	 */
	  
	  @OneToMany(mappedBy = "typeDonneesIdFk")
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TYPE_Donnees_ID")
	private Long typeDonneesId;
	@Column(name="LIBELLE")
	private String typeDonneesLibelle;
	
	/** *************Getters and Setters***************** **/
	
	
	public Long getTypeDonneesId() {
		return typeDonneesId;
	}
	public void setTypeDonneesId(Long typeDonneesId) {
		this.typeDonneesId = typeDonneesId;
	}
	public String getTypeDonneesLibelle() {
		return typeDonneesLibelle;
	}
	public void setTypeDonneesLibelle(String typeDonneesLibelle) {
		this.typeDonneesLibelle = typeDonneesLibelle;
	}
	/** ******************Enumeration***************** **/
	
	@Enumerated(EnumType.STRING)
	private TypeDeDonnees typeDeDonnees;
	
	
	/** *****************Constructor**************** **/
	public TypeDonnees(Long typeDonneesId, String typeDonneesLibelle) {
		super();
		this.typeDonneesId = typeDonneesId;
		this.typeDonneesLibelle = typeDonneesLibelle;
	}
	public TypeDonnees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
