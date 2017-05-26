package manuscript.module.user.management.exception;

public class DisciplinesValidationException extends RuntimeException {
	private static final long serialVersionUID = 139998937885632672L;

	private String message;

	public DisciplinesValidationException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
