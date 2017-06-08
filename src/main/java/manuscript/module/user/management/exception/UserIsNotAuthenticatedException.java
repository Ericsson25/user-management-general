package manuscript.module.user.management.exception;

public class UserIsNotAuthenticatedException extends RuntimeException {

	private static final long serialVersionUID = -6490087875080972022L;
	private String message;

	public UserIsNotAuthenticatedException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
