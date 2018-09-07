package NotasYFaltas.view;

import java.util.Scanner;

import NotasYFaltas.entity.NotasYFaltasE;
import View.InputTypes;

public class RegistroNotasyFaltas {
	
	public static NotasYFaltasE ingresar(Scanner scanner)  	
	{

	int codigoEstudiante = InputTypes.readInt("Ingrese el codigo del estudiante :	", scanner);
	int creditos = InputTypes.readInt("Ingrese los creditos de la materia :		"	, scanner);
	int numeroFaltas = InputTypes.readInt("Ingrese el numero de Faltas por el estudiante :		", scanner);
	int ID_Clase = InputTypes.readInt("Ingrese el identificador de la clase :		", scanner);
	int notaPrimerParcial = InputTypes.readInt("Ingrese la nota del Primer Parcial :		", scanner);
	int notaSegundoParcial = InputTypes.readInt("Ingrese la nota del Segundo Parcial :		", scanner);
	int notaTercerParcial = InputTypes.readInt("Ingrese la nota del Tercer Parcial :		", scanner);
	int notaFinal = InputTypes.readInt("Ingrese la nota Parcial Final :		", scanner);

	return new NotasYFaltasE(codigoEstudiante,creditos,numeroFaltas, ID_Clase, notaPrimerParcial, notaSegundoParcial, notaTercerParcial, notaFinal);
}
}