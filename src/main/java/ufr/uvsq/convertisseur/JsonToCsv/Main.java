package ufr.uvsq.convertisseur.JsonToCsv;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;


import com.fasterxml.jackson.databind.JsonMappingException;

import ufr.uvsq.convertisseur.Exceptions.*;

public class Main
{
	
	static Scanner sc;
	
	/**
	 * Fonction principale du projet : c'est la fonction d'entre du projet
	 * @param args
	 * @throws SaisiesExceptions :gere les exceptions lies aux erreurs de saisie
	 * @throws CheminsExceptions : Il resout l'exception qui survient si le chemin n'est pas valide
	 * @throws JsonMappingException :Il resout l'exception si le mapping ne se pas bien
	 * @throws IOException :Il resout l'exception qui survient pour la gestion des fichiers
	 */

	public static void main(String[] args) throws SaisiesExceptions,CheminsExceptions
	{
		int test=1;
	
		do
	{
		
			int choice=0;
			try
			{ 
				
				choice=Show.menu();

			}
			catch(Exception e){};
				
		
		switch (choice) 
		{
	        case 1:
			     {	   
			    	    System.out.println("Entrez le chemin absolu du fichier JSON");	
			    	    
			    		sc =new Scanner(System.in);		
<<<<<<< HEAD
			    		String chemin=sc.nextLine();
			    		System.out.println(chemin);
=======
			    		
			    		String chemin=sc.nextLine();		
			    		
>>>>>>> e13b2e3d9d604a10aef8b401dc4732e38468727c
			    		Convertisseur converter =new Convertisseur();
			    		try{
			    			converter.to_csv(chemin);
			    			System.out.println("Operation terminée");
			    			test= Show.suite();
			    		}
			    		catch(Exception e){
			    			
			    		}
	        	 }
	            break; 
	        case 2:
	        	{	   
			    	    System.out.println("Entrez le chemin absolu du fichier CSV");	
			    	    
			    		sc =new Scanner(System.in);		
<<<<<<< HEAD
			    		String chemin=sc.nextLine();
			    		Convertisseur converter =new Convertisseur();	    		
=======
			    		
			    		String chemin=sc.nextLine();
			    		
			    		//je creee une nouvelle instance de ma classe convertisseur
			    		Convertisseur converter =new Convertisseur();	    
			    		
>>>>>>> e13b2e3d9d604a10aef8b401dc4732e38468727c
			    		try {
							converter.to_json(chemin);
							System.out.println("Operation terminer");
				    		test= Show.suite();
						} catch (Exception e) {
							
						}
			    		
	        	}
	        	break;
	        case 3:
        	{	   
		    	    System.out.println("Entrez le chemin absolu du fichier JSON");		
		    	    
		    		sc =new Scanner(System.in);		
		    		
		    		String chemin=sc.nextLine();	
<<<<<<< HEAD
		    		To_Csv_With_Config converter =new To_Csv_With_Config();	    		
		    		//converter.config(chemin);
=======
		    		
		    		To_Csv_With_Config converter =new To_Csv_With_Config();	    
		    		
		    		converter.config(chemin);
		    		
>>>>>>> e13b2e3d9d604a10aef8b401dc4732e38468727c
		    		System.out.println("Operation terminer");
		    		
		    		test= Show.suite();
        	}
	            break;
	        case 4:
	        {
	        	System.out.println("◙◙◙ ◙◙◙ ◙◙◙ ◙◙◙ ");
	    		System.out.println("    Aurevoir   \n");
	    		System.out.println("◙◙◙ ◙◙◙ ◙◙◙ ◙◙◙ ");
	            System.exit(0);
	        }
	        /*default:
			        	System.out.println("Votre choix ne se trouve pas dans le menu/n! ");
			        	
			    		test= Show.suite();*/
		
	    }
	} while(test==1);
	
	}

}
