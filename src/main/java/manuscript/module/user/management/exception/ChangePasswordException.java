package manuscript.module.user.management.exception;

public class ChangePasswordException extends RuntimeException {

	private static final long serialVersionUID = 2686886479348210632L;
	private String message;

	public ChangePasswordException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
