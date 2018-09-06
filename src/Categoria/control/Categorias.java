package Categoria.control;

import Categoria.entity.Categoria;
import Categoria.entity.InexistenciaCategorias;
import Producto.entity.Producto;

public class Categorias {
	private Categoria[] categorias;
	private int cantidad;
	
	private int ultimo;// señala el ultimo elemento

	public Categorias(int tamaño) {
		categorias = new Categoria[tamaño];
		cantidad = 0;
		ultimo = -1;
	}

	public void ingresarCategoria(Categoria categoria) throws java.lang.ArrayIndexOutOfBoundsException {
		categorias[++ultimo] = categoria;
		cantidad++;
	}

	public void eliminarCategoria(int codCategoria) throws InexistenciaCategorias {//llamar a produycto view
		
		int indice = buscarCategoria(codCategoria);
		
			if (indice != ultimo) {
				for (int i = indice; i < ultimo; i++) // recorre los elementos apartir de i
				{
					categorias[i] = categorias[i + 1];
				}
			}
			ultimo--;
			cantidad--;
		}
	

	public int buscarCategoria(int codCategoria) throws InexistenciaCategorias {
		int indice = -1;
		int i = 0;
		while (i <=ultimo) {
			if (codCategoria == categorias[i].getCodCategoria()) {
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
	{
		boolean valor=false;
		for(int i=0;i<ultimo;i++)
			{
			if(codCategoria==categorias[i].getCodCategoria())
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


	public void setCategorias(Categoria[] categorias) {
		this.categorias = categorias;
	}
	

	public Categoria [] getCategoria() {
		return categorias;
	}	
	
 
}
