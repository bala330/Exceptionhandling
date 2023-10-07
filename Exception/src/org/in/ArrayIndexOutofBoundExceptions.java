package org.in;

public class ArrayIndexOutofBoundExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30};
		
		try {
			 a[4]=50;
	         System.out.println("store the value:"+a);
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array index handle the exception");
		}
		finally {
			System.out.println("It will excute all time");
		}
         
	}

}
