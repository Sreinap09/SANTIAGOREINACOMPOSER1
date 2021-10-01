package co.edu.unbosque.controller;

import co.edu.unbosque.model.Archivoejercicio;
import co.edu.unbosque.model.Cancion;
import co.edu.unbosque.model.persistence.Propiedades;
import co.edu.unbosque.view.*;

public class Controller {
	
	private View vista;
	private Archivoejercicio archivo;
	private Cancion c;
	Propiedades prop = new Propiedades();
	View v = new View();
	
	public Controller() {
		
		funcionar();
		System.out.println(prop.leerPropiedades());
		vista = new View();
		archivo = new Archivoejercicio();
		c = new Cancion();
		String cancion = archivo.generarParra();
		vista.mostrarMensaje(cancion);
		archivo.getArchivo().escribirArchivo(cancion);
	}
		public void funcionar() {
		
		vista.mostrarMensaje("Bienvenido al Reggaeton Gang, pulse ok para generar un perreo bien bueno");
		vista.mostrarMensaje("Se generó una nueva canción, presione ok para guardarla");
		vista.mostrarMensaje("La canción generada es: \n \n"+c.gestionarArchivoCadena());
			
	}
}
