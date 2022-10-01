package s102e1_gomezdina;

import java.util.ArrayList;

import excepciones.VentaVaciaException;

public class Venta {

	private ArrayList<Producto> productos;
	private VentaVaciaException vve;
	
	public Venta() {
		this.productos = new ArrayList<Producto>();
		this.vve = new VentaVaciaException("Primero debe cargar productos");
	}
	
	
	public ArrayList<Producto> agregarProducto(Producto producto){
	
		this.productos.add(producto);
		return productos;
	}
	
	
	public float calcularTotal() {
		
		float precioTotal = 0;
		//recorremos el array de productos y retornaremos el valor de sus precios acumulado
			for(int i = 0; i < this.productos.size(); i++) {
				precioTotal += this.productos.get(i).getPrecio();
			}
		
		return precioTotal;
	}

	
	
}

