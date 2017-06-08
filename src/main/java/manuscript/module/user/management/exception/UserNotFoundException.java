package manuscript.module.user.management.exception;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 8075922985756601605L;

	private String message;

	public UserNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
