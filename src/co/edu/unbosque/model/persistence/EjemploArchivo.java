package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;

import javax.swing.JFileChooser;

import java.io.*;

public class EjemploArchivo {

	private String NombreArchivo;
	
	public EjemploArchivo() {
		NombreArchivo = guardarArchivo()+".txt";
	}
	
	public File guardarArchivo() {
		
		JFileChooser file = new JFileChooser();
		file.showSaveDialog(file);
		File guardar = file.getSelectedFile();
		
		return guardar;
	}
	
	public int escribirArchivo(String dato) {
		File file = new File(NombreArchivo);
		
		try {
			FileWriter fw = new FileWriter(file);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(dato);
			fw.close();	
			
		} catch(IOException e) {
			return -1;
		}
		
		return 0;
	}
	
	public String leerArchivo() {
		
		String linea = "";
		String cadena = "";
		
		File f = new File(this.NombreArchivo);
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea=br.readLine();
			
			while(linea != null) {
				cadena += linea+ "\n";
				linea = br.readLine();
			}
			fr.close();
			
		} catch (IOException e) {
			return null;
		}
		return cadena;
	}
	
	public String getNombreArchivo() {
		return NombreArchivo;
	}
	
	public void setNombreArchivo(String NombreArchivo) {
		this.NombreArchivo = NombreArchivo;
	}
	
}
