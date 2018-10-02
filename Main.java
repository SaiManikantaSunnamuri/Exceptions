package exceptions;
import java.util.*;
public class Main {
	static void validate(int age) {
		if(age<=0)
			throw new InvalidAgeException();
		else {
			System.out.println(age);
		}
		System.out.println("age");
	}
	static void validate1(int age)throws InvalidAgeException1 {
		if(age<=0)
			throw new InvalidAgeException1();
	}
	static void idValidate(int id) {
		if(id>=48 && id<=57) {
			throw new InvalidIdException();
		}
	}
		static void nameValidate (String name) {
			char[]a=name.toCharArray();
			for(int i=0;i<a.length;i++) {
			if(a[i]>65 && a[i]<90) {
				throw new InvalidUsernameException();
			}
			}
		}
	
	
	public static void main(String args[]) throws InvalidAgeException1{
		try {
			validate1(-1);
		}
		catch(Exception e) {
			throw new InvalidAgeException1();
		}
		finally {
			System.out.println("cccc");
		}
	}
}
	
	