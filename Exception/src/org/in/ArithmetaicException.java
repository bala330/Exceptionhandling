package org.in;

import java.util.Scanner;

public class ArithmetaicException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Print the number:");
		int number=sc.nextInt();
		
		int number1=sc.nextInt();
		
		
		
		try {
		
			int number2=number/number1;
		System.out.println("we have dividing the numbers we can handle in the inside try block");
			
		} catch (ArithmeticException e) {
			System.out.println("Divided by zero execption ocuurend in the program");
		}
		
     finally {
	System.out.println("It will execut in the program all time");
}	

	}

}
