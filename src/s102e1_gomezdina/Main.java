package s102e1_gomezdina;

import ejemplo_array_indice_sobrecargado.ExceptionOnArray;
import excepciones.VentaVaciaException;

public class Main {

	public static void main(String[] args) {
		VentaVaciaException vve = new VentaVaciaException("");

		System.out.println(vve.getMessage());
		Producto producto1 = new Producto("Huawei", 980);
		Producto producto2 = new Producto("Mac", 2000);
		Producto producto3 = new Producto("Eraser", 150);

		Venta nuevaVenta = new Venta();

		nuevaVenta.agregarProducto(producto1);
		nuevaVenta.agregarProducto(producto2);
		nuevaVenta.agregarProducto(producto3);
		nuevaVenta.toString();
		System.out.println("El valor total de tu compra es: "+nuevaVenta.calcularTotal()+"€");
		
		ExceptionOnArray exArray = new ExceptionOnArray();

		try {
			exArray.getValue(6);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: indice de array fuera de limites" + e.getMessage());
			System.out.println("Tipo de Exception:" + e.getClass());
		}

	}

}
