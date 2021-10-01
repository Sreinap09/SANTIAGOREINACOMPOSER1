package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {

	private Properties prop = new Properties();
	private String archivoprop = "composer.properties";
	
	public Propiedades() {
		escribirPropiedades();
	}
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("Numero de estrofas", "3");
			prop.setProperty("Nombre del proyecto ", "Reggaeton Gang-2001");
			prop.setProperty("Autor", "Santiago Reina");
			prop.store(new FileOutputStream(archivoprop), null);
		} catch (IOException e) {
			return -1;
		}
		
		return 0;
	}
	
	public String leerPropiedades() {
		String linea = "";
		try {
			prop.load(new FileInputStream(archivoprop));
			
			prop.list(System.out);
			
			linea += "Numero de estrofas: "+prop.getProperty("Numero de estrofas");
			linea += "Nombre del proyecto: "+prop.getProperty("Nombre del proyecto");
			linea += "Autor del proyecto: "+prop.getProperty("Autor");
			int Estrofas = Integer.parseInt(prop.getProperty("Numero de estrofas"));
			
		} catch (IOException e) {
			return null;
		}
		
		return linea;
	}
}
