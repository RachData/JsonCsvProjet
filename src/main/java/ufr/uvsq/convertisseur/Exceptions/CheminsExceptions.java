package ufr.uvsq.convertisseur.Exceptions;

/**
 * Permet de gerer les exceptions levés lie a la gestion des  fichiers 
 */
public class CheminsExceptions extends Exception 
{
	/**
	 * Permet de gerer les exceptions lie aux fichiers inexistant
	 */
	public CheminsExceptions()
	{
		System.out.println("\nLe Fichier specifier n'existe pas\n");
	}
}