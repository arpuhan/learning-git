package lab;
import java.util.Scanner;

public class UserInput {
	String message;
	DisplayMessege Dm;

	    public static void main(String[] args) {
	    	DisplayMessage dm = new DisplayMessage();
	    	UserInput ui = new UserInput();
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a message: ");
	        ui.message = sc.nextLine();
	        DisplayMessage displayMessage = new DisplayMessage();
			displayMessage.display(message);
	        
	    }
	}
