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
@Table(name="FORMULAIRE_CHAMPS")
public class FormulaireChamps implements Serializable{
     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name="TYPE_CHAMPS_ID")
     private TypeChamps typeChampsIdFk;
     
     @JoinColumn(name="TYPE_DONNEES_ID")
     private TypeDonnees typeDonneesIdFk;
     
     @JoinColumn(name="LISTE_VALEURS_ID")
     private ListeValeurs listeValeursIdFk;
     
     @JoinColumn(name="FORMULAIRES_ID")
     private Formulaires formulairesIdFk;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="FORMULAIRE_CHAMP_NOM")
	private Long formulaireChampNom ;
    @Column(name="LIBELLE")
    private String formulaireChampLibelle;
    @Column(name="LARGEUR")
    private Long formulaireChampLargeur;
    @Column(name="COLSPAN")
    private Long formulaireChampColspan;
    
    /** *****************Getters and Setters ****************** **/
	public Long getFormulaireChampNom() {
		return formulaireChampNom;
	}
	public void setFormulaireChampNom(Long formulaireChampNom) {
		this.formulaireChampNom = formulaireChampNom;
	}
	public String getFormulaireChampLibelle() {
		return formulaireChampLibelle;
	}
	public void setFormulaireChampLibelle(String formulaireChampLibelle) {
		this.formulaireChampLibelle = formulaireChampLibelle;
	}
	public Long getFormulaireChampLargeur() {
		return formulaireChampLargeur;
	}
	public void setFormulaireChampLargeur(Long formulaireChampLargeur) {
		this.formulaireChampLargeur = formulaireChampLargeur;
	}
	public Long getFormulaireChampColspan() {
		return formulaireChampColspan;
	}
	public void setFormulaireChampColspan(Long formulaireChampColspan) {
		this.formulaireChampColspan = formulaireChampColspan;
	}
	
	/** ****************** Constructor  ************** **/
	public FormulaireChamps(String formulaireChampLibelle, Long formulaireChampLargeur, Long formulaireChampColspan) {
		super();
		this.formulaireChampLibelle = formulaireChampLibelle;
		this.formulaireChampLargeur = formulaireChampLargeur;
		this.formulaireChampColspan = formulaireChampColspan;
	}
	public FormulaireChamps() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
    
}
