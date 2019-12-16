package ufr.uvsq.convertisseur.JsonToCsv;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import ufr.uvsq.convertisseur.Exceptions.CheminsExceptions;
import ufr.uvsq.convertisseur.Exceptions.FichiersVide;

public class ChemiException {
	String chemin1;
	String chemin2;
	String chemin3;
	String chemin4;
	Convertisseur convertir;
	

	@Before
	  public void setup() {
		String chemin1="yggkjh";//erreur de syntaxe
		String chemin2="C:\\Users\\utilisateur\\Documents\\Java\\convertisseur\\JsonCsvProjet\\src\\main\\Ressources\\Csv_to_Json\\jsonFromCsv.json";//fichier existant
		String chemin3="C:\\Users\\utilisateur\\Documents\\Java\\convertisseur\\JsonCsvProjet\\src\\main\\Ressources\\Csv_to_Json\\Vide_Csv.csv";//fichier exiatnt mais vide
		String chemin4=null;//syntaxe null vide
		convertir =new Convertisseur();
	  }

	 @Test(expected = CheminsExceptions.class)
	public void erreurSyntaxetest() throws CheminsExceptions, JsonMappingException, FichiersVide, IOException {
		 //try {
			 convertir.to_csv(chemin1);
		/* }catch(Exception es) {
			 
		 }*/
		 
	}
	 
	 @Test()
		public void fichierexistanttest() throws CheminsExceptions {
			 try {
				 convertir.to_csv(chemin2);
			 }catch(Exception es) {
				 
			 }
			 
		}
	 
	 @Test()
		public void fichiervidetest() throws CheminsExceptions {
			 try {
				 convertir.to_csv(chemin3);
			 }catch(Exception es) {
				 
			 }
			 
		}
	 
	 @Test()
		public void SyntaxeNulltest() throws CheminsExceptions {
			 try {
				 convertir.to_csv(chemin4);
			 }catch(Exception es) {
				 
			 }
			 
		}

}
