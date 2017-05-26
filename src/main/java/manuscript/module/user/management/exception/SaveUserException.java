package manuscript.module.user.management.exception;

public class SaveUserException extends RuntimeException {
	private static final long serialVersionUID = -4903601380225472438L;

	private String message;

	public SaveUserException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
