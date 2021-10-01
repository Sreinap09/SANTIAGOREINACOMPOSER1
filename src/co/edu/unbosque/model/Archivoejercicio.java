package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.*;

public class Archivoejercicio {

	public String gestionarArchivoCadena(String dato) {
		EjemploArchivo archivo = new EjemploArchivo();
		archivo.escribirArchivo(dato);
		
	return "Se generó la siguiente canción: \n" + archivo.leerArchivo();
	}
	
	public String[] recogerTipoPalabra(int tipo) {
		
		EjemploArchivo archivoFrases = new EjemploArchivo();
		String[] frases = archivoFrases.leerArchivo(tipo).split(",");
		
		return frases;
				
	}
	
	public String generarParra() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getArchivo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
