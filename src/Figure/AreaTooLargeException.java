package Figure;

public class AreaTooLargeException extends RuntimeException {
	public AreaTooLargeException(Throwable cause) {
		super(cause);

	}

	public AreaTooLargeException(String message) {
		super(message);
	}

	public AreaTooLargeException() {
		super();
	}

}
