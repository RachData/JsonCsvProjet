package ufr.uvsq.convertisseur.JsonToCsv;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
		String chemin1="yggkjh";
		String chemin2="C:\\Users\\utilisateur\\Documents\\Java\\convertisseur\\JsonCsvProjet\\src\\main\\Ressources\\Csv_to_Json\\jsonFromCsv.json2";
		String chemin3="C:\\Users\\utilisateur\\Documents\\Java\\convertisseur\\JsonCsvProjet\\src\\main\\Ressources\\Csv_to_Json\\videJson.json2";
		String chemin4=null;
		convertir =new Convertisseur();
	  }

	 @Test()
	public void test() throws CheminsExceptions {
		 try {
			 convertir.to_csv(chemin3);
		 }catch(Exception es) {
			 
		 }
		 
	}

}
