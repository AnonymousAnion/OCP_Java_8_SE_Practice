package living;

public class InedibleException extends RuntimeException {

	public InedibleException() {
		
		super();
	}
	
	public InedibleException(String errorMessage) {
		
		super(errorMessage);
	}
}
