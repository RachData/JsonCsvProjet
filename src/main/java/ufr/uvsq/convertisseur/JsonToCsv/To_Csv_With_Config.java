package ufr.uvsq.convertisseur.JsonToCsv;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

/**
 * cette classe s'occupe de la gestion des transformations lorsqu'il ya un fichier de configuration a utilisé
 * @author MAIGA
 *
 */
public class To_Csv_With_Config 
{
	/**
	 * 
	 * @param chemin : il represente le chemin absolu du fichier json a convertir
	 * @throws IOException :il represente les exceptions liés au fichier
	 * @throws JsonMappingException : il represente les exceptions liées Mappage de json
	 *
	 */
	public void config(String chemin) throws IOException, JsonMappingException, IOException
	{
	//fonction de configuration qui prend en compte le chemin du fichier json
		
	CsvMapper csvMapper = new CsvMapper();
	
	CsvSchema csvSchema = csvMapper
	  .schemaFor(Properties_Config.class)
	  .withHeader();
	try
	{
	
	csvMapper.addMixIn(Structure.class,Properties_Config.class);
	
	Structure[] structure = new ObjectMapper()
		    .readValue(new File(chemin), Structure[].class);
		     
		csvMapper.writerFor(Structure[].class)
		    .with(csvSchema)
		    .writeValue(new File("‪F:/EclipseProjects/json2csv/src/main/ressources/Fichier_Json_2_Csv"), structure);
	}
	catch(Exception e)
	{
		
		e.printStackTrace();
	}
	
	}
	
	
}
