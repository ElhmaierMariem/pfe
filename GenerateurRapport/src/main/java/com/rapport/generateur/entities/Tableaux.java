package com.rapport.generateur.entities;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="TABLEAUX")
public class Tableaux implements Serializable {
	
	  @OneToMany(mappedBy = "tableauxResultatIdFk" )
	  private List<Rapports> listRapports ;
	 
	  @OneToMany(mappedBy = "tableauxIdFk")
	  
	 
	 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy =GenerationType.IDENTITY)
     @Column(name="TABLEAUX_ID")
     private Long tableauxId;
     @Column(name="LIBELLE")
     private String tableauxLibelle;
     
     /** *************Getters and Setters ****************** **/
	public Long getTableauxId() {
		return tableauxId;
	}
	public void setTableauxId(Long tableauxId) {
		this.tableauxId = tableauxId;
	}
	public String getTableauxLibelle() {
		return tableauxLibelle;
	}
	public void setTableauxLibelle(String tableauxLibelle) {
		this.tableauxLibelle = tableauxLibelle;
	}
	
	/** **************** Constructor *************** **/
	public Tableaux(String tableauxLibelle) {
		super();
		this.tableauxLibelle = tableauxLibelle;
	}
	public Tableaux() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
     
}
