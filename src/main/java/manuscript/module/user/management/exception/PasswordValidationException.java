package manuscript.module.user.management.exception;

public class PasswordValidationException extends RuntimeException {
	private static final long serialVersionUID = 3801651532756967568L;

	private String message;

	public PasswordValidationException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
