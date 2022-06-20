package Figure;

public class LimitException extends RuntimeException {
	public LimitException(String message, Throwable cause) {
		super(message, cause);
	}

	public LimitException(String message) {
		super(message);
	}

	public LimitException() {
		super();
	}

}
