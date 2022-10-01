package excepciones;

public class VentaVaciaException extends Exception {
	protected String message;
	//Constructor
	public VentaVaciaException(String message) {
		super(message);
	}
	
	public void Exception(String message) {
		this.message = message;
	}
	@Override 
	public String getMessage() {
		return "“Para hacer una venta primero debes añadir productos”";
	}
	
}
