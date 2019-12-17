package ufr.uvsq.convertisseur.JsonToCsv;

import ufr.uvsq.convertisseur.Exceptions.FichiersVide;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheminVide {
	
	@Before
	  public void setup() {
		String chemin1="";
		String chemin2="";
		String chemin3="";
		String chemin4=null;
		Convertisseur converter =new Convertisseur();
	  }

	 @Test(expected = FichiersVide.class)
	public void test() {
		fail("Not yet implemented");
	}

}
