package assignment;

import java.util.Scanner;

public class person {
	String firstName;
	String lastName;
	String dateOfBirth;
	String Email;
	String occupation;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		person p1 = new person();
		p1.firstName="ALOK RANJAN";
		p1.lastName = "PUHAN";
		p1.dateOfBirth = "03/03/2003";
		p1.Email = "puhanalok1@gmail.com";
		p1.occupation = "STUDENT";
		System.out.println("FIrst name is : "+p1.firstName);
		System.out.println("Last Name is :"+p1.lastName);
		System.out.println("Date Of Birth : "+p1.dateOfBirth);
		System.out.println("Email is : "+p1.Email); 
		System.out.println("Occupation is :"+p1.occupation);
	}

}
