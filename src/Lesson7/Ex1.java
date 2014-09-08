package Lesson7;

public class Ex1 {
	static int model;
	
	String firstName;
	String lastName;
	
	Ex1() {
		model = 0;
		firstName = "";
		lastName = "";
	}
	
	Ex1(int m, String fnm, String lnm) {
		model = m;
		firstName = fnm;
		lastName = lnm;
	}
	
	public void PrintIdentity() {
		System.out.println("ModelNo: "+model);
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);		
	}
}
