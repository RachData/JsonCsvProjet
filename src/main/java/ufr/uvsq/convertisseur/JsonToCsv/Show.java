package ufr.uvsq.convertisseur.JsonToCsv;

import java.util.Scanner;

public class Show 
{
	public static int menu ()
	{
		  

		        int selection;
		        Scanner input = new Scanner(System.in);

		        /***************************************************/
		        System.out.println("◙◙◙-------◙◙◙-------◙◙◙\n");
		        System.out.println("\tVotre choix Svp\n");
		        System.out.println("◙◙◙-------◙◙◙-------◙◙◙\n");
		        System.out.println("1 - Convertion JSON en CSV ");
		        System.out.println("2 - Convertion CSV en JSON ");
		        System.out.println("3 - Convertion en Mode Reformatage ");
		        System.out.println("4 - Quitter");
		        
		        selection = input.nextInt();
		        return selection;    
		
	}
	
	public static int suite() //throws MonException
	{
		int selection;
		Scanner input=new Scanner(System.in);
		System.out.println("◙◙◙*************◙◙◙*************◙◙◙\n");
		
		System.out.println("Souhaitez vous continuer (1/0)?\n");

		System.out.println("◙◙◙*************◙◙◙*************◙◙◙\n");

		selection = input.nextInt();
		if(selection==0)
		{//throw new MonException();
			System.out.println("◙◙◙ ◙◙◙ ◙◙◙ ◙◙◙ ");
			System.out.println("    Aurevoir   \n");
			System.out.println("◙◙◙ ◙◙◙ ◙◙◙ ◙◙◙ ");
			System.exit(-1);
		}
		return selection;
	}

}