package assignment;

public class Vehicle {
	String make; 
	String model;
	String engineCapcity;
	int seatCapcity;
	int topSpeed;
	int numberOfGears;
	public void start() {
		System.out.println("! Vehicle started !");
	}
	public void stop() {
		System.out.println("! Vehicle stopped !");
	}
	public void gearUp(int upGear) {
		System.out.println("\n Change to Gear : "+upGear+"\n");
	}
	public void gearDown(int downGear) {
		System.out.println("\n Changed to Gear : "+downGear+"\n");
	}
	public void getVehicleInfo() {
		Vehicle v1 = new Vehicle();
		v1.make = "Toyota";
		v1.model = "Fortuner";
		v1.engineCapcity = "2.8L";
		v1.seatCapcity = 7;
		v1.topSpeed = 200;
		v1.numberOfGears = 6;
		System.out.println("-------------------Vehicle Info--------------------------");
		System.out.println("Vehicle make by : "+v1.make);
		System.out.println("Vehicle model name :"+v1.model);
		System.out.println("Vehicle Engine Capacity : "+v1.engineCapcity);
		System.out.println("Vehicle Seat Capacity : "+v1.seatCapcity);
		System.out.println("Vehicle Top Speed : "+v1.topSpeed);
		System.out.println("Vehicle Number Of Gears : "+ v1.numberOfGears);
		System.out.println("--------------------------------------------");
		
	}
}
