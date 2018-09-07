package NotasYFaltas.view;

import java.util.Iterator;
import java.util.Scanner;

import NotasYFaltas.control.NotasYFaltasC;
import NotasYFaltas.entity.NotasYFaltasE;
import View.InputTypes;

public class NotasYFaltasV {
	private NotasYFaltasC registroC;
	private Scanner scanner;

	public NotasYFaltasV(NotasYFaltasC registroC, Scanner scanner) {
		super();
		this.registroC = registroC;
		this.scanner = scanner;
	}

	public void addNotasFaltasC() {
		NotasYFaltasE registroE;
		registroE = RegistroNotasyFaltas.ingresar(scanner);
		registroC.ingresarRegistro(registroE);
	}

	public void listRegistroEntidad() {
		for (Iterator<NotasYFaltasE> i = registroC.getCodigoEstudiante().iterator(); i.hasNext();)
			System.out.println(i.next());
	}

	public void Lista()  {
		int codigoEstudiante = InputTypes.readInt("Codigo Estudiante", scanner);
		System.out.println(registroC.getCodigoEstudiante().get(registroC.buscarRegistro(codigoEstudiante)));
		}

	}
