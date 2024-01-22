package assignment;

import java.util.Scanner;

public class assignment4 {
	public static void main(String[] args) {
		boolean cycle = true;
		while(cycle ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("############### COMMAND LINE CALCULATOR ###############");
		System.out.println("Please select an option from below");
		System.out.println("1. Add two numbers \n2.Subtract two numbers \n3.Multiply two numbers \n4.Divide two numbers \n5.Quit Program");
		int choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.print("Enter two numbers to add");
					int add1 = sc.nextInt();
					int add2 = sc.nextInt();
					int sum = add1+add2;
					System.out.println("Addition of "+add1+" and "+add2+" is : "+add1+" + "+add2+" = "+sum);
					break;
				case 2:
					System.out.print("Enter two numbers to subtract");
					int sub1 = sc.nextInt();
					int sub2 = sc.nextInt();
					int sub = sub1-sub2;
					System.out.println("Subtraction of "+sub1+" and "+sub2+" is : "+sub1+" - "+sub2+" = "+sub);
					break;
				case 3:
					System.out.print("Enter two numbers to Multiply");
					int mul1 = sc.nextInt();
					int mul2 = sc.nextInt();
					int mul = mul1*mul2;
					System.out.println("Multiplication of "+mul1+" and "+mul2+" is : "+mul1+" * "+mul2+" = "+mul);
					break;
				case 4:
					System.out.print("Enter two numbers to divide");
					int div1 = sc.nextInt();
					int div2 = sc.nextInt();
					int div = div1/div2;
					System.out.println("Division of "+div1+" and "+div2+" is : "+div1+" / "+div2+" = "+div);
					break;
				case 5:
					System.out.print("Exiting Program");
					cycle = false;
					break;
				default :
					System.out.println("Enter a valid input");
			}
		}
		
	}

}
