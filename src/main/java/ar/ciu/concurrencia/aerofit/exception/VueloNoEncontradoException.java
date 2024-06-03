package ar.ciu.concurrencia.aerofit.exception;

public class VueloNoEncontradoException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public VueloNoEncontradoException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
	
}
