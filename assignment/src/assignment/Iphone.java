package assignment;

import java.util.Scanner;

public class Iphone extends phone {
	String name;
	phone Iph;
	int number;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean on = true;
		int tempnum;
		Iphone Iph1 = new Iphone();
		phone Iph2 = new phone();
		Iph2.frequency = 30000;
		Iph2.generation = 5;
		Iph2.modelNum ="MD12034XA";
		Iph2.phBrand = "Iphone";
		Iph2.phName ="Iphone 13 pro";
		Iph2.storage = "512GB";
		Iph1.Iph = Iph2;
		while(on) {
		System.out.println("Select a operation to perform");
		System.out.println("1.SwitchOn\n2.SwitchOff\n3.DialACall");
		int choose = sc.nextInt();
			switch(choose) {
			case 1:
				Iph1.SwitchOn();
				break;
			case 2:
				Iph1.SwitchOff();
				on =false;
				break;
			case 3:	
				System.out.println("Enter number to dial :");
				tempnum = sc.nextInt();
				Iph1.number = tempnum;
				Iph1.Iph.DialACall(Iph1.number);
				break;
			default :
				System.out.println("Enter a valid input");
				}
		}

	}
}
