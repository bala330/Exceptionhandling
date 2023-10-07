package org.in;


@SuppressWarnings("serial")
class Incorrectpassword extends Exception{
	public Incorrectpassword(String s) {
		super(s);
	}
	
}

public class LoginSystem {
	
	static void password(String s2) throws Incorrectpassword {
		if (s2!="krishnanhh2@") {
			System.out.println("It is incorrect password");
			throw new Incorrectpassword("The password you've entered the incorrect password");
			
		} else {
        System.out.println("It will login page");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			password("balahhh2@");
		} catch (Incorrectpassword e) {
			// TODO Auto-generated catch block
			System.out.println("It is incorrect paswword : "+ e);
			
		}
	
	}

}
