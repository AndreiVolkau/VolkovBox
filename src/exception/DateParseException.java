package exception;

public class DateParseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DateParseException(String msg, Exception e) {
		super(msg, e);
	}
}
