package assignment;

import java.util.Scanner;

public class assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the customer type");
		System.out.println("1.PREMIUM\n2.SILVER\n3.GOLD\n4.DIAMOND\n5.PLATINUM");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("User Type Premium");
			System.out.println("Credit Points: 1000");
			System.out.println("Discount 5%");
		}else if(choice == 2){
			System.out.println("User Type Silver");
			System.out.println("Credit Points: 2000");
			System.out.println("Discount 10%");
		}else if(choice == 3) {
			System.out.println("User Type Gold");
			System.out.println("Credit Points: 10000");
			System.out.println("Discount 15%");
		}else if(choice == 4) {
			System.out.println("User Type Diamond");
			System.out.println("Credit Points: 15000");
			System.out.println("Discount 20%");
		} else if(choice == 5) {
			System.out.println("User Type Platinum");
			System.out.println("Credit Points: 20000+");
			System.out.println("Discount 25%");			}
		else {
			System.out.println("Enter a valid choice ");
		}
	}
		

}
