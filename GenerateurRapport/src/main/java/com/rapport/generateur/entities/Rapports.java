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
@Table(name="RAPPORTS")
public class Rapports implements Serializable {
	
	  @ManyToOne (optional=false,fetch = FetchType.LAZY)
	  
	  @JoinColumn(name="CATEGORIE_RAPPORT_ID")
	  private CategorieRapports categorieRapportIdFk;
	 
	  @JoinColumn(name="TABLEAUX_ID" , insertable = false , updatable = false)
	  private Tableaux tableauxResultatIdFk;
	
	  @JoinColumn(name="FORMULAIRES_ID" , insertable = false , updatable = false)
	  private Formulaires critereDeRechercheIdFk;
	  
	
	
	  @JoinColumn(name="LIBELLE" , insertable = false , updatable = false) private
	  Formulaires resultatEnteteId;
	 
	 
	  
	  @JoinColumn(name="RESSOURCE_DONNEES_ID")
	  private RessourceDonnees ressourceDonneesIdFk;
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="RAPPORT_ID")
	private Long rapportId;
	@Column(name = "LIBELLE")
       private String rapportLibelle;
	@Column(name="REQUETE_SQL_ENTETE")
       private String requeteSqlEntete;
	@Column(name="REQUETE_SQL_DETAIL")
       private String requeteSqlDetail;
	@Column(name = "AVEC_TEMPLATE")
       private boolean avecTemplate;
	@Column(name="TEMPLATE")
       private String template;
	
	/** ******************* Getters and Setters*************** **/
	
	public Long getRapportId() {
		return rapportId;
	}

	public void setRapportId(Long rapportId) {
		this.rapportId = rapportId;
	}
	public String getRapportLibelle() {
		return rapportLibelle;
	}
	public void setRapportLibelle(String rapportLibelle) {
		this.rapportLibelle = rapportLibelle;
	}
	public String getRequeteSqlEntete() {
		return requeteSqlEntete;
	}
	public void setRequeteSqlEntete(String requeteSqlEntete) {
		this.requeteSqlEntete = requeteSqlEntete;
	}
	public String getRequeteSqlDetail() {
		return requeteSqlDetail;
	}
	public void setRequeteSqlDetail(String requeteSqlDetail) {
		this.requeteSqlDetail = requeteSqlDetail;
	}
	public boolean isAvecTemplate() {
		return avecTemplate;
	}
	public void setAvecTemplate(boolean avecTemplate) {
		this.avecTemplate = avecTemplate;
	}
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/** ************** Constructor ******************** **/
	
	public Rapports(String rapportLibelle, String requeteSqlEntete, String requeteSqlDetail, boolean avecTemplate,
			String template) {
		super();
		this.rapportLibelle = rapportLibelle;
		this.requeteSqlEntete = requeteSqlEntete;
		this.requeteSqlDetail = requeteSqlDetail;
		this.avecTemplate = avecTemplate;
		this.template = template;
	}

	public Rapports() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

