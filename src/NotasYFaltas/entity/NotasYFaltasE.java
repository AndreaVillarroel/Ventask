package NotasYFaltas.entity;

import java.util.Iterator;

public class NotasYFaltasE {

	private int codigoEstudiante;
	private int creditos;
	private int numeroFaltas;
	private int ID_Clase;
	private int notaPrimerParcial;
	private int notaSegundoParcial;
	private int notaTercerParcial;
	private int notaFinal;

	public NotasYFaltasE(int codigoEstudiante, int creditos, int numeroFaltas, int iD_Clase,
			int notaPrimerParcial, int notaSegundoParcial, int notaTercerParcial, int notaFinal) {
		super();
		this.codigoEstudiante = codigoEstudiante;
		this.creditos = creditos;
		this.numeroFaltas = numeroFaltas;
		ID_Clase = iD_Clase;
		this.notaPrimerParcial = notaPrimerParcial;
		this.notaSegundoParcial = notaSegundoParcial;
		this.notaTercerParcial = notaTercerParcial;
		this.notaFinal = notaFinal;
	}

	public int getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public void setCodigoEstudiante(int codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getNumeroFaltas() {
		return numeroFaltas;
	}

	public void setNumeroFaltas(int numeroFaltas) {
		this.numeroFaltas = numeroFaltas;
	}

	public int getID_Clase() {
		return ID_Clase;
	}

	public void setID_Clase(int iD_Clase) {
		ID_Clase = iD_Clase;
	}

	public int getNotaPrimerParcial() {
		return notaPrimerParcial;
	}

	public void setNotaPrimerParcial(int notaPrimerParcial) {
		this.notaPrimerParcial = notaPrimerParcial;
	}

	public int getNotaSegundoParcial() {
		return notaSegundoParcial;
	}

	public void setNotaSegundoParcial(int notaSegundoParcial) {
		this.notaSegundoParcial = notaSegundoParcial;
	}

	public int getNotaTercerParcial() {
		return notaTercerParcial;
	}

	public void setNotaTercerParcial(int notaTercerParcial) {
		this.notaTercerParcial = notaTercerParcial;
	}

	public int getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}

	@Override
	public String toString() {
		return "RegistroNotasYFaltasE [codigoEstudiante=" + codigoEstudiante + ", creditos=" + creditos
				+ ", numeroFaltas=" + numeroFaltas + ", ID_Clase=" + ID_Clase + ", notaPrimerParcial="
				+ notaPrimerParcial + ", notaSegundoParcial=" + notaSegundoParcial + ", notaTercerParcial="
				+ notaTercerParcial + ", notaFinal=" + notaFinal + "]";
	}

	public Iterator<NotasYFaltasE> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public int indexOf(NotasYFaltasE registro) {
		// TODO Auto-generated method stub
		return 0;
	}

}
