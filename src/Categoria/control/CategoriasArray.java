package Categoria.control;

import java.util.ArrayList;
import java.util.Vector;

import Categoria.entity.Categoria;
import Categoria.entity.InexistenciaCategorias;

public class CategoriasArray {	
	//private Vector<Categoria> categorias;

	private ArrayList<Categoria> categorias;
	private int cantidad;

	public CategoriasArray()
	{categorias= new ArrayList<>();}

	public void añadir(Categoria categorias)
	{this.categorias.add(categorias);}

	public int buscarCategoria(int codCategoria) throws InexistenciaCategorias {

		int indice = -1;
		int ultimo=categorias.size();
		int i=0;
		while (i <=ultimo) {
			if (categorias.contains(codCategoria)) {
				indice = i;
				break;
			}
			i++;
		}

		if(indice<0)
		{throw new InexistenciaCategorias();}
		return indice;
	}
	public boolean searchBoolean(int codCategoria) throws InexistenciaCategorias//verifica la existencia de la categoria
	{		int ultimo=categorias.size();

	boolean valor=false;
	for(int i=0;i<ultimo;i++)
	{
		if(categorias.contains(codCategoria))
		{valor=!valor;}
	}
	//lo que sucedera si no existe el valor
	if(!valor)
	{
		throw new InexistenciaCategorias();
	}
	return valor;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}


	public ArrayList<Categoria> getCategoria() {
		return categorias;
	}	
}
