package assignment;

import java.util.Scanner;

public class car {
	String make;
	String model;
	String engineCapacity;
	Transmission tr1;
	int speed;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tempspeed;
		boolean isrunning = true;
		car thar = new car();
		thar.engineCapacity = "2.0L";
		thar.make = "Mahindra";
		thar.model = "THAR";
		Transmission tr = new Transmission();
		tr.make = "Toyota";
		tr.numOfGears = 5;
		tr.type = "SUV";
		thar.tr1= tr;
		while(isrunning) {
			System.out.println("****************CAR MENU********************");
			System.out.println("1.Start car \n2.Stop car \n3.Increase speed by x km/h \n4.Decrease speed by y km/h");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("Car started");
				break;
			case 2:
				System.out.println("Car stopped");
				break;
			case 3: 
				System.out.println("increase speed to increament");
				tempspeed =sc.nextInt();
				thar.speed += tempspeed;
				thar.tr1.gearChange(thar.speed);
				break;
			case 4:
				System.out.println("Decrease speed to decreament");
				tempspeed =sc.nextInt();
				thar.speed -= tempspeed;
				thar.tr1.gearChange(thar.speed);
				break;
			case 5:
				System.out.println("Quiting program");
				isrunning = false;
				break;
			default :
				System.out.println("please select a valid input");
			}
		}
		
	}
}
