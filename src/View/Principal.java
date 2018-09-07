package View;


import java.util.Scanner;

import NotasYFaltas.view.NotasYFaltasV;

import NotasYFaltas.control.NotasYFaltasC;

@SuppressWarnings("unused")
public class Principal {

	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		NotasYFaltasC registroC = null;
	   
		
		NotasYFaltasV registroV = new NotasYFaltasV(registroC,  scanner);
		 MenuRegistroNotas.menu(scanner, registroV);

		scanner.close();
		
	}

	

}
