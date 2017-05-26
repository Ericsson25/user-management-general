package manuscript.module.user.management.exception;

public class NameAlreadyReservedException extends RuntimeException {

	private String errorMessage;

	public NameAlreadyReservedException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
