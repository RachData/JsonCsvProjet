package ufr.uvsq.convertisseur.JsonToCsv;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import ufr.uvsq.convertisseur.Exceptions.CheminsExceptions;
import ufr.uvsq.convertisseur.Exceptions.FichiersVide;

public class ConvertisseurTest {
	String chemin1CSV;
	String chemin2CSV;
	String chemin3CSV;
	String chemin4CSV;
	String chemin1JSON;
	String chemin2JSON;
	String chemin3JSON;
	String chemin4JSON;
	Convertisseur convertir;
	

	@Before
	  public void setup() {
		chemin1CSV="yggkjh";//erreur de syntaxe
		chemin2CSV="‪src\\main\\Ressources\\Json_to_Csv\\Fichier_json.json";//fichier existant
		chemin3CSV="src\\main\\Ressources\\Json_to_Csv\\VideJson.json";//fichier exiatnt mais vide
		chemin4CSV=null;//syntaxe null vide
		
		chemin1JSON="yggkjh";//erreur de syntaxe
		chemin2JSON="src\\main\\Ressources\\Csv_to_Json\\FichierCsv.json";//fichier existant
		chemin3JSON="src\\main\\Ressources\\Csv_to_Json\\Vide_Csv.json";//fichier exiatnt mais vide
		chemin4JSON=null;//syntaxe null vide
		
		convertir =new Convertisseur();
	  }

	 @Test()
	public void erreurSyntaxetestTOCSV() throws CheminsExceptions, FichiersVide {
		 try {
			 
				 convertir.to_csv(chemin1CSV);;
			 }catch(Exception es) {
				 
			 }

			
		
		 
	}
	 
	 @Test()
		public void fichierexistanttestTOCSV() throws CheminsExceptions {
			 try {
				 convertir.to_csv(chemin2CSV);
			 }catch(Exception es) {
				 
			 }
			 
		}
	 
	 @Test()
		public void fichiervidetestTOCSV() throws CheminsExceptions {
			 try {
				 convertir.to_csv(chemin3CSV);
			 }catch(Exception es) {
				 
			 }
			 
		}
	 
	 @Test()
		public void SyntaxeNulltestTOCSV() throws CheminsExceptions {
			 try {
				 convertir.to_csv(chemin4CSV);
			 }catch(Exception es) {
				 
			 }
			 
		}

	 
	 
	 @Test()
		public void erreurSyntaxetestTOJSON() throws CheminsExceptions, FichiersVide {
			 try {
					 convertir.to_json(chemin1JSON);
				 }catch(Exception es) {
					 
				 }

				
			
			 
		}
		 
		 @Test()
			public void fichierexistanttestTOJSON() throws CheminsExceptions {
				 try {
					 convertir.to_json(chemin2JSON);
				 }catch(Exception es) {
					 
				 }
				 
			}
		 
		 @Test()
			public void fichiervidetestTOJSON() throws CheminsExceptions {
				 try {
					 convertir.to_json(chemin3JSON);
				 }catch(Exception es) {
					 
				 }
				 
			}
		 
		 @Test()
			public void SyntaxeNulltestTOJSON() throws CheminsExceptions {
				 try {
					 convertir.to_json(chemin4JSON);
				 }catch(Exception es) {
					 
				 }
				 
			}

}
