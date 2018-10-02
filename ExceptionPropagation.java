package exceptions;

public class ExceptionPropagation {
	public void validate(int age) {
		if (age<0) {
			throw new InvalidAgeException();
		}
	}
	public void a() {
		int age=40/0;
	}
	public void b() {
		a();
	}
	public void c() {
		try {
			b();
		}
		catch(InvalidAgeException e) {
		System.out.println("invalid age");	
		}
		catch(Exception e) {
			System.out.println("final invalid age");
		}
	}

	public static void main(String[] args) {
		ExceptionPropagation e=new ExceptionPropagation();
		e.c();
			System.out.println("completed");
		}

	}


