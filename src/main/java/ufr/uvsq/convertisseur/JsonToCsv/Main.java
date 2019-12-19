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

	public static void main(String[] args) throws SaisiesExceptions,CheminsExceptions, IOException
	{
		int test=1;
		/*Convertisseur t=new Convertisseur();
		t.csv_Path();
		t.json_Path();
		System.out.println("chemin csv  "+t.csv_Path()+"  chemin json  "+t.json_Path());*/
	
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

			    		String chemin=sc.nextLine();
			    	    Convertisseur converter =new Convertisseur();
			    	
			    	
			    	    System.out.println(" votre fichier CSV convertit est dans le dossier F:/EclipseProjects/newProjet/JsonCsvProjet/src/main/Ressources/Json_to_Csv ");	
			    	    	    		
			    		try
			    		{
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
		    		
		    		String chemin=sc.nextLine();
	        		
	        		  Convertisseur converter =new Convertisseur();	
	        		   //chemin=converter.csv_Path();
			    	   // System.out.println("Le Chemin de votre fichier CSV à convertir est : "+chemin);	
			    	   
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
        		Convertisseur converter=new Convertisseur();
        		converter.openFile();     		
		    		

		    		//System.out.println("Operation terminer");
		    		
		    		//test= Show.suite();
        	}
	            break;
	        	
	        case 4:
        	{	   
		    	    System.out.println("Entrez le chemin absolu du fichier JSON");		
		    	    
		    		sc =new Scanner(System.in);		
		    		
		    		String chemin=sc.nextLine();	
		    		
		    		To_Csv_With_Config converter =new To_Csv_With_Config();	    
		    		
		    		//converter.config(chemin);

		    		System.out.println("Operation terminer");
		    		
		    		test= Show.suite();
        	}
	            break;
	        case 5:
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
