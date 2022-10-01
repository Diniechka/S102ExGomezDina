package excepciones;
/**
 *  Este constructor no podría heredar del método get del hijo. Debería ser al
 * revés para poder heredar este método. La única manera es hacer
 * protected el mensaje. Esta clase super() es la primera en la
 * jerarquía. El modificador protected tiene una visibilidad de una subclase
 * que puede ser observada desde otro paquete.
 *
 */
import java.util.InputMismatchException;

public class Exception {
	protected String message;

	// Constructor.
	public Exception(String message) {

	}

	public String getMessage() {
		return message + "Para hacer una venta primero debes añadir productos";
	}

	public void getValue(int i) {
		// TODO Auto-generated method stub
		
	}

}
