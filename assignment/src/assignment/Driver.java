package assignment;

import java.util.Scanner;

public class Driver {
	Vehicle v2;
	int upGear;
	int downGear;
	public static void main(String[] args) {
		int tempUpGear =1;
		int tempDownGear = tempUpGear;
		boolean cycle = true;
		boolean started= false;
		Scanner sc = new Scanner(System.in);
		Driver d1 = new Driver();
		Vehicle v3 = new Vehicle();
		d1.v2 = v3;
		while(cycle) {
		System.out.println("#################### MENU ########################");
		System.out.println("1.Start \n2.Stop \n3.Gear Up \n4.Gear Down \n5.Vehicle Info");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			d1.v2.start();
			started = true;
			break;
	
		case 2:
			if(started == true) {	
				d1.v2.stop();
				started = false;
			}else {
				System.out.println("Plaese first start the car");
			}
			break;
		case 3 :
			if(started == true) {
				
				if(tempUpGear < 7) {
					tempDownGear = tempUpGear;
					d1.upGear = tempUpGear;
					d1.v2.gearUp(d1.upGear);
					tempUpGear++;
					
				}else {
					System.out.println("Reached the maximum Number Of Gear");
				}
			}else {
				System.out.println("Please first start the car");
			}
			break;
		case 4 :
			if(started == true) {
				
				tempUpGear--;
				if(tempDownGear >0) {
					tempDownGear--;
					d1.downGear =tempDownGear; 
					d1.v2.gearDown(d1.downGear);
				} else {
					System.out.println("Reached the Minimum number of Gears");
				}
			}else {
				System.out.println("Please first start the car");
			}
			break;
		case 5 :
			
			d1.v2.getVehicleInfo();
			break;
		case 6 :
			System.out.println("Exiting Program");
			cycle = false;
			break;
		default :
			System.out.println("Enter a valid choice");
				
		}
	}
				
		
	}

}
