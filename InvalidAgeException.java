package exceptions;

public class InvalidAgeException extends RuntimeException{
	public String tString () {
		return "age should be positive";
	}
	}
