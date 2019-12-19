package ufr.uvsq.convertisseur.Exceptions;


/**
 * Permet de gerer les exceptions levés au niveaux des fichiers
 */
public class FichiersVide extends Exception 
{
	/**
	 * Permet de gerer les exceptions lie aux fichiers vides
	 */
	
	public FichiersVide()
	
	{
		System.out.println("Votre fichier est vide ou le chemin est invalide...");
	}

}