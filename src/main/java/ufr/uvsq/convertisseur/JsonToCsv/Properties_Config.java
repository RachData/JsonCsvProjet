package ufr.uvsq.convertisseur.JsonToCsv;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * classe abstraite indiquant les modifations si il ya configuratuion 
 * @author MAIGA
 *
 */
@JsonPropertyOrder({
    "libelle",
    "Prix_total"
     
  
})
public abstract class Properties_Config {
	
	
	
     
    @JsonProperty("libelle")
    private String libelle; 
     
    @JsonProperty("prix total")
    private int prix_total; 
     
    @JsonIgnore
    private float quantite;
  

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getPrix_total() {
		return prix_total;
	}

	public void setPrix_total(int prix_total) {
		this.prix_total = prix_total;
	}

	public float getQuantite() {
		return quantite;
	}

	public void setQuantite(float quantite)
	{
		this.quantite = quantite;
	}



 
}