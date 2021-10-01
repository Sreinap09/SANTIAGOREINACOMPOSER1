package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.EjemploArchivo;

public class Cancion {

	private EjemploArchivo archivo;
	private String [] g1 = new String [] {"Mami", "Bebe", "Princess", "Mami" };
	private String [] g2 = new String [] {"yo quiero", "yo puedo", "yo vengo a", "voy a"};
	private String [] g3 = new String [] {"encenderte", "amarte", "ligar", "jugar"};
	private String [] g4 = new String [] {"hasta el amanecer", "todo el día", "hasta que salga el sol", "toda la noche"};
	private String [] g5 = new String [] {"sin miedo", "sin compromiso", "sin anestesia", "feis to feis"};

	
	public String crearFrase() {
		
		String palabra1 = g1[(int) (Math.floor(Math.random() * (0-4)) + 4)]; 
		String palabra2 = g2[(int) (Math.floor(Math.random() * (0-4)) + 4)]; 
		String palabra3 = g3[(int) (Math.floor(Math.random() * (0-4)) + 4)]; 
		String palabra4 = g4[(int) (Math.floor(Math.random() * (0-4)) + 4)]; 
		String palabra5 = g5[(int) (Math.floor(Math.random() * (0-4)) + 4)]; 

		return palabra1+palabra2+palabra3+palabra4+palabra5;
	}
	
	public String crearEstrofa() {
		return crearFrase()+"\n"+crearFrase()+"\n"+crearFrase()+"\n"+crearFrase()+"\n";	
	}
	
	public String crearCancion() {
		return crearEstrofa()+"\n"+ "\n"+crearEstrofa()+"\n"+"\n"+crearEstrofa();
	}
	
	public String gestionarArchivoCadena() {
		EjemploArchivo archivo = new EjemploArchivo();
		archivo.escribirArchivo(crearCancion());
		
		return archivo.leerArchivo();
	}
	
	public EjemploArchivo getArchivo() {
		return archivo;
	}
	
	public void setArchivo(EjemploArchivo archivo) {
		
	}
	
}
