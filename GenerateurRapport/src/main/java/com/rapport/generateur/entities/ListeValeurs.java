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
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="LISTE_VALEURS")
public class ListeValeurs implements Serializable {
   @OneToMany(mappedBy = "listeValeursIdFk")
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name="RESSOURCE_DONNEES_ID")
   private RessourceDonnees ressourceDonneesIdFk;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name="LISTE_VALEURS_ID")
	private Long listeValeursId;
      @Column(name="LIBELLE")
    private String listeValeursLibelle;
      @Column(name="REQUETE_SQL")
    private String listeValeursRequeteSql;
      @Column(name="COLONNE_ID")
    private String listeValeursColonneId;
      @Column(name="COLONNE_VALEUR")
    private String listeValeursColonneValeur;
      
      /** ************Getters and Setters*************** **/
	
      public Long getListeValeursId() {
		return listeValeursId;
	}
	public void setListeValeursId(Long listeValeursId) {
		this.listeValeursId = listeValeursId;
	}
	public String getListeValeursLibelle() {
		return listeValeursLibelle;
	}
	public void setListeValeursLibelle(String listeValeursLibelle) {
		this.listeValeursLibelle = listeValeursLibelle;
	}
	public String getListeValeursRequeteSql() {
		return listeValeursRequeteSql;
	}
	public void setListeValeursRequeteSql(String listeValeursRequeteSql) {
		this.listeValeursRequeteSql = listeValeursRequeteSql;
	}
	public String getListeValeursColonneId() {
		return listeValeursColonneId;
	}
	public void setListeValeursColonneId(String listeValeursColonneId) {
		this.listeValeursColonneId = listeValeursColonneId;
	}
	public String getListeValeursColonneValeur() {
		return listeValeursColonneValeur;
	}
	public void setListeValeursColonneValeur(String listeValeursColonneValeur) {
		this.listeValeursColonneValeur = listeValeursColonneValeur;
	}
	
	/** ****************Constructor******************** **/ 
	public ListeValeurs(String listeValeursLibelle, String listeValeursRequeteSql, String listeValeursColonneId,
			String listeValeursColonneValeur) {
		super();
		this.listeValeursLibelle = listeValeursLibelle;
		this.listeValeursRequeteSql = listeValeursRequeteSql;
		this.listeValeursColonneId = listeValeursColonneId;
		this.listeValeursColonneValeur = listeValeursColonneValeur;
	}
	public ListeValeurs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
      
    
      
}
