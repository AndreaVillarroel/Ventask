package View;

import java.util.Scanner;

import NotasYFaltas.view.NotasYFaltasV;


public class MenuRegistroNotas {
	private static int encabezado(Scanner scanner) {
		int opcion;
		while (true) {
			System.out.println();
			System.out.println("********NOTAS Y FALTAS********");

			System.out.println("--------------------------------------");
			System.out.println("	Ingrese una opcion	: ");
			System.out.println("--------------------------------------");
			System.out.println("1. Ingresar Notas y Faltas ");
			System.out.println("2. Listar Notas y Faltas ");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("Su opcion?", scanner);
			if (opcion >= 0 && opcion <= 2) {
				return opcion;
			}
		}
	}

	public static void menu(Scanner scanner, NotasYFaltasV registroV) {
		boolean salir = false;
		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				registroV.addNotasFaltasC();
				break;
			case 2:
				registroV.listRegistroEntidad();
				break;
			}
		}
	}
}