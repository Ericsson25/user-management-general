package manuscript.module.user.management.exception;

public class PersonalDataSettingsException extends RuntimeException {

	private static final long serialVersionUID = -1816123634581275126L;
	private String message;

	public PersonalDataSettingsException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
