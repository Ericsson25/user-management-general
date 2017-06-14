package manuscript.module.user.management.exception;

public class DisciplinesUpdateException extends RuntimeException {

	private static final long serialVersionUID = -5149940947304697460L;

	private String message;

	public DisciplinesUpdateException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
