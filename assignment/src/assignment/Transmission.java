package assignment;

public class Transmission {
	String type;
	String make;
	int numOfGears;
	public void gearChange(int speed)	{
		if(speed > 0 && speed <= 20) {
			System.out.println("Gear cahnged to 1");
		}else if(speed > 20 && speed <= 40) {
			System.out.println("Gear cahnged to 2");
		}else if(speed > 40 && speed <= 60) {
			System.out.println("Gear cahnged to 3");
		}else if(speed > 60 && speed <= 80) {
			System.out.println("Gear cahnged to 4");
		}else {
			System.out.println("Gear cahnged to 5");
		}
	}

}
