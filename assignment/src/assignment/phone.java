package assignment;

public class phone {
	String phName;
	String phBrand;
	String modelNum;
	String storage;
	int frequency;
	int generation;
	public void SwitchOn() {
		System.out.println("Switched on");
	}
	public void SwitchOff() {
		System.out.println("Switched off");
	}
	public void DialACall(int number) {
		System.out.println("Calling ...........\n"+ number);
	}

}
