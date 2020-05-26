package com.rapport.generateur.entities;

import java.io.Serializable;


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
@Table(name="TABLEAU_COLONNES")
public class TableauColonnes implements Serializable {
      
    
      @ManyToOne(optional=false ,fetch = FetchType.LAZY)
	 @JoinColumn(name="TYPE_DONNEES_ID" , insertable = false , updatable = false)
	  private TypeDonnees typeDonneesIdFk;
     
      @ManyToOne(optional=false ,fetch = FetchType.LAZY)
      @JoinColumn(name="TABLEAUX_ID")
      private Tableaux tableauxIdFk;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
      @GeneratedValue(strategy =GenerationType.IDENTITY)
      @Column(name="TABLEAU_COLONNES_ID")
      private Long tableauColonnesId ;
      @Column(name="LIBELLE")
      private String tableauColonnesLibelle;
      @Column(name="LARGEUR")
      private Long tableauColonnesLargeur;
      
      /** ******** Getters and Setters************ **/
	public Long getTableauColonnesId() {
		return tableauColonnesId;
	}
	public void setTableauColonnesId(Long tableauColonnesId) {
		this.tableauColonnesId = tableauColonnesId;
	}
	public String getTableauColonnesLibelle() {
		return tableauColonnesLibelle;
	}
	public void setTableauColonnesLibelle(String tableauColonnesLibelle) {
		this.tableauColonnesLibelle = tableauColonnesLibelle;
	}
	public Long getTableauColonnesLargeur() {
		return tableauColonnesLargeur;
	}
	public void setTableauColonnesLargeur(Long tableauColonnesLargeur) {
		this.tableauColonnesLargeur = tableauColonnesLargeur;
	}
	
	/** ************* Constructor ********************* **/
	public TableauColonnes(String tableauColonnesLibelle, Long tableauColonnesLargeur) {
		super();
		this.tableauColonnesLibelle = tableauColonnesLibelle;
		this.tableauColonnesLargeur = tableauColonnesLargeur;
	}
	public TableauColonnes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
      
      
}
