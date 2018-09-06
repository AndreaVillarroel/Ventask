package Producto.control;

import java.util.ArrayList;

import Categoria.entity.Categoria;
import Producto.entity.Producto;

public class ProductosArray {
	private ArrayList<Producto> productos;
	private int cantidad;
	private int ultimo;// señala el ultimo elemento

	public ProductosArray()
	{productos= new ArrayList<>();}

	public void añadir(Producto productos)
	{this.productos.add(productos);}


	public void eliminar(int codProducto) 
	{productos.remove(codProducto);}

	private int buscar(int codProducto) {	
		int ultimo=productos.size();
		int indice = -1;
		int i = 0;
		while (i < ultimo) {
			if (productos.contains(codProducto)) {
				indice = i;
				break;
			}
			i++;
		}
		return indice;
	}

	public int getCantidad() {
		return cantidad;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}
	
	
}
