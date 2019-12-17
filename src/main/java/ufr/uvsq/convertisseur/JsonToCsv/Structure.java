package ufr.uvsq.convertisseur.JsonToCsv;

/**
 * Cette classe definit la structure des informations de notre fichier json ou csv en entré
 * @author MAIGA
 *
 */

public class Structure 
{
	/**
	 * @attribut : libelle ,quantite, prix_unitaire
	 * 
	 * getter et setter
	 * 
	 */
	private String libelle;
	
	private int quantite;
	
    private double prix_unitaire;
    
	public String getLibelle()
	{
		return libelle;
	}
	public void setLibelle(String libelle) 
	{
		this.libelle = libelle;
	}
	public int getQuantite() 
	{
		return quantite;
	}
	public void setQuantite(int quantite) 
	{
		this.quantite = quantite;
	}
	public double getPrix_unitaire() 
	{
		return prix_unitaire;
	}
	public void setPrix_unitaire(double prix_unitaire) 
	{
		this.prix_unitaire = prix_unitaire;
	}
	


}