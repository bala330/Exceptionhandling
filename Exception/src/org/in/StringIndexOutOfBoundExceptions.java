package org.in;

public class StringIndexOutOfBoundExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str="Bala";
		try {
			int index=Str.charAt(5);
			System.out.println("Print the charachter of value:"+index);
			
		} catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("String index handle the program in this method");
		}
	    finally {
	    	System.out.println("It will excute all time");
			
		}

	}

}
