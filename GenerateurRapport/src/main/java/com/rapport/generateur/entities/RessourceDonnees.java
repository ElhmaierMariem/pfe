package com.rapport.generateur.entities;

import java.io.Serializable;
import java.util.List;

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
@Table(name="RESSOURCE_DONNEES")
public class RessourceDonnees implements Serializable {
	/*
	 * @OneToMany(mappedBy = "ressourceDonneesIdFk") private List<RessourceDonnees>
	 * listRessourceDonnees;
	 */
   
   @OneToMany(mappedBy = "ressourceDonneesIdFk")
   
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name="TYPE_RESSOURCE_DONNEES_ID")
   private RessourceDonnees typeRessourceDonneesIdFk;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="RESSOURCE_DONNEES_ID")
	private Long ressourceDonneesId;
     @Column(name="LIBELLE")
    private String ressourceDonneesLibelle;
     @Column(name="ADRESSE_IP")
    private String ressourceDonneesAdresseIp;
     @Column(name="NOM_BASE_DONNEES")
    private String ressourceDonneesNomBaseDonnees;
     @Column(name="LOGIN")
    private String ressourceDonneesLogin;
     @Column(name="MOT_PASSE")
    private String ressourceDonneesMotPasse;
     
     /** ***************Getters and Setters***************** **/
	public Long getRessourceDonneesId() {
		return ressourceDonneesId;
	}
	public void setRessourceDonneesId(Long ressourceDonneesId) {
		this.ressourceDonneesId = ressourceDonneesId;
	}
	public String getRessourceDonneesLibelle() {
		return ressourceDonneesLibelle;
	}
	public void setRessourceDonneesLibelle(String ressourceDonneesLibelle) {
		this.ressourceDonneesLibelle = ressourceDonneesLibelle;
	}
	public String getRessourceDonneesAdresseIp() {
		return ressourceDonneesAdresseIp;
	}
	public void setRessourceDonneesAdresseIp(String ressourceDonneesAdresseIp) {
		this.ressourceDonneesAdresseIp = ressourceDonneesAdresseIp;
	}
	public String getRessourceDonneesNomBaseDonnees() {
		return ressourceDonneesNomBaseDonnees;
	}
	public void setRessourceDonneesNomBaseDonnees(String ressourceDonneesNomBaseDonnees) {
		this.ressourceDonneesNomBaseDonnees = ressourceDonneesNomBaseDonnees;
	}
	public String getRessourceDonneesLogin() {
		return ressourceDonneesLogin;
	}
	public void setRessourceDonneesLogin(String ressourceDonneesLogin) {
		this.ressourceDonneesLogin = ressourceDonneesLogin;
	}
	public String getRessourceDonneesMotPasse() {
		return ressourceDonneesMotPasse;
	}
	public void setRessourceDonneesMotPasse(String ressourceDonneesMotPasse) {
		this.ressourceDonneesMotPasse = ressourceDonneesMotPasse;
	}
	
	/** ***************Constructor***************** **/
	public RessourceDonnees(String ressourceDonneesLibelle, String ressourceDonneesAdresseIp,
			String ressourceDonneesNomBaseDonnees, String ressourceDonneesLogin, String ressourceDonneesMotPasse) {
		super();
		this.ressourceDonneesLibelle = ressourceDonneesLibelle;
		this.ressourceDonneesAdresseIp = ressourceDonneesAdresseIp;
		this.ressourceDonneesNomBaseDonnees = ressourceDonneesNomBaseDonnees;
		this.ressourceDonneesLogin = ressourceDonneesLogin;
		this.ressourceDonneesMotPasse = ressourceDonneesMotPasse;
	}
	public RessourceDonnees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
     
     
}
