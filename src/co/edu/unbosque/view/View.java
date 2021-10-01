package co.edu.unbosque.view;

import javax.swing.JOptionPane;

	public class View {

	public View() {
		
	}
	
	public String obtenerDato(String mensaje) {
		return JOptionPane.showInputDialog(mensaje);
	}
	
	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje );
	}
}
