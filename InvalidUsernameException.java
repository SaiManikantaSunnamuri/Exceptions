package exceptions;

public class InvalidUsernameException extends RuntimeException {
	public String tostring() {
		return "invalid username";
	}

}
