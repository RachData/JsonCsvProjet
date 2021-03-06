package ufr.uvsq.convertisseur.JsonToCsv;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import ufr.uvsq.convertisseur.Exceptions.*;

/**
 * Classe convertisseur implementant les methodes de converstions
 * 
 * 
 * @author MAIGA
 * 
 *
 */
 
public class Convertisseur

{
	

	/**
	 * Cette methode permet de passer d'un fichier json à un fichier csv
	 * 
	 * @param chemin : il represente le chemin absolu du fichier json a convertir
	 * 
	 * @throws CheminsExceptions : Il resout l'exception qui survient si le chemin renseigne est invalide
	 * 
	 * @throws FichiersVide : Il resout l'exception qui survient si le fichier est vide
	 */
	


	  public void to_csv (String chemin) throws CheminsExceptions,FichiersVide//, JsonGenerationException, JsonMappingException, IOException

	{
		  //Verification de l'existance du fichier
		  
		 //String chemin=json_Path();
		  
		  File Fichier=new File(chemin);
		  
		  if(Fichier.exists()==false)
		  {
			  throw new CheminsExceptions();
		  //if(true)
		  }
		  else
		  {
			  
			  if(Fichier.length()==0){
				  throw new FichiersVide();
		  }
			  else
			  {
				  try 
				  {

						JsonNode jsonTree = new ObjectMapper().readTree(Fichier);
						
						com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder csvSchemaBuilder = CsvSchema.builder();
						
						JsonNode firstObject = jsonTree.elements().next();
						
						firstObject.fieldNames().forEachRemaining(fieldName -> {((com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder) csvSchemaBuilder).addColumn(fieldName);} );
						
						CsvSchema csvSchema = ((CsvSchema) csvSchemaBuilder.build()).withHeader();
						
						CsvMapper csvMapper = new CsvMapper();
					
						csvMapper.writerFor(JsonNode.class)
							  .with(csvSchema)
							  .writeValue(new File("src\\main\\Ressources\\Json_to_Csv\\Json_to_csv.csv"), jsonTree);
						

					} catch (com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException e)

					{
						System.out.println("Format du fichier json incorrect");
					} catch (JsonProcessingException e) {
						System.out.println("");
					} catch (IOException e) {
						System.out.println("");
					}
			  }  
		  }
	}
	  
	  
	  
	  
	  /**
	   * Cette methode permet de passer d'un fichier csv à un fichier json
	   * @param chemin : il represente le chemin absolu du fichier csv a convertir
	   * @throws CheminsExceptions :Il resout l'exception qui survient si le chemin renseigne est invalide
	   * @throws FichiersVide : Il resout l'exception qui survient si le fichier est vide
	   */
	
	public void to_json(String chemin) throws CheminsExceptions,FichiersVide
	{
		//Verification de l'existance du fichier

		//String chemin=csv_Path();

		File Fichier=new File(chemin);
		  
		  if(Fichier.exists()==false)
		  {
			  throw new CheminsExceptions();
		  //if(true){
		  }
		  else
		  {
			  
			  if(Fichier.length()==0)
			  {
				  throw new FichiersVide();
				  
			  }
			  else
			  
			  {

				  try
				  {
			  			CsvSchema monSchema_Csv = CsvSchema.emptySchema().withHeader();
			  			
			  			CsvMapper csvMapper = new CsvMapper();

			  			MappingIterator<Structure> Structure= csvMapper.readerFor(Structure.class)
			  					.with(monSchema_Csv)
			  					.readValues(new File(chemin));
			  			new ObjectMapper()

			  				.configure(SerializationFeature.INDENT_OUTPUT, true)
			  				.writeValue(new File("src\\main\\Ressources\\Csv_to_Json\\jsonFromCsv.json"), Structure.readAll());
			  		}
				  
			  		catch (Exception e)
				  
			  		{

			  			
			  		}
			  }
		  }
	}

			/**
			 * 
			 * @return
			 */
		  public String json_Path()
		  {
			  String path="";
			  
			  try
			  {
			  
					 InputStream myfile =new FileInputStream("src/main/Ressources/Mesconfig.properties") ;
					 if(myfile != null)
					 {
						 Properties prop =new Properties();
						 prop.load(myfile);
						path= prop.getProperty("json_Path");
					 }	  
			  }
			  
			  catch(Exception e)
			  {
				  e.printStackTrace();
			  }
			  
			  return path;
		  }
		  
		  
		  /**
		   * 
		   * @return
		   */
		  public String csv_Path()
		  
		  {
			  String path="";
			  
			  try
			  {
			  
					 InputStream myfile =new FileInputStream("src/main/Ressources/Mesconfig.properties") ;
					 if(myfile != null)
					 {
						 Properties prop =new Properties();
						 prop.load(myfile);
						path= prop.getProperty("csv_Path");
					 }	  
			  }
			  
			  catch(Exception e)
			  {
				  e.printStackTrace();
			  }
			  
			  return path;
		  }
		  
		  
			    public  void openFile() throws IOException
			    {

			       File myfile =new File("F:\\EclipseProjects\\newProjet\\JsonCsvProjet\\src\\main\\Ressources\\Mesconfig.properties") ;
			      
			        if(!Desktop.isDesktopSupported()){
			            System.out.println("Votre fichier ne peut etre ouvert");
			            return;
			        }
			        
			        Desktop desktop = Desktop.getDesktop();
			        if(myfile.exists()) 
			        {
			        	//System.out.println("test");
			        	desktop.edit(myfile);
			        }
			        
			    }


	}
		 