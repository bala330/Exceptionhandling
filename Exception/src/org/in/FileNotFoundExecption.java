package org.in;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileNotFoundExecption {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("we have write the directory of file: ");
		String File=sc.next();
		try {
			FileOutputStream file=new FileOutputStream(File);
			System.out.println("It will handling inside the try block of the file execption");
		} catch (FileNotFoundException e) {
			System.out.println("we have handling execption is occured in the program");
			e.printStackTrace();
		}

	}

}
