package NotasYFaltas.control;

import java.util.ArrayList;
import java.util.Iterator;

import NotasYFaltas.entity.NotasYFaltasE;

public class NotasYFaltasC {

	private static ArrayList<NotasYFaltasE> registroE;
	private int ultimo;

	public NotasYFaltasC() {
		registroE = new ArrayList<NotasYFaltasE>();
	}

	public static void ingresarRegistro(NotasYFaltasE registro) {
		registroE.add(registro);
	}

	public void eliminarRegistro(int codigoRegistro) {
		int indice = buscarRegistro(codigoRegistro);
		registroE.remove(indice);
	}

	public int buscarRegistro(int codigoRegistro) {
		int indice = -1;
		NotasYFaltasE registro = null;

		for (Iterator<NotasYFaltasE> iterator = registro.iterator(); iterator.hasNext();) {
			registro = iterator.next();
			if (codigoRegistro == registro.getCodigoEstudiante()) {
				indice = registro.indexOf(registro);
			}
			break;
		}
		return indice;
	}

	public ArrayList<NotasYFaltasE> getCodigoEstudiante() {
		return registroE;
	}

}
