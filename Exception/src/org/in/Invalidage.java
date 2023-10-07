package org.in;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidageException extends Exception{
	public InvalidageException(String s) {
		super(s);
		
	}
}

public class Invalidage {
	static void validateofage(int age) throws InvalidageException {
		
		if (age<18) {
			System.out.println("Invalid age");
			throw new InvalidageException("Not Egible to vote");
			
		} else {
			System.out.println("Valid age");
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validateofage(15);
		} catch (InvalidageException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid age of Exception: "+e);
		}
				
		

	}

}
