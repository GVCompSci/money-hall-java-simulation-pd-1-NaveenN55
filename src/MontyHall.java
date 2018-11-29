import java.util.Random;
import java.util.Scanner;

public class MontyHall {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int option;
		char change;
		int answer;
		System.out.println("*** Welcome to the game show! ***");  
		System.out.println("Select the door (1, 2, or 3): ");
		option = scn.nextInt();
		
		Random rn = new Random();
		answer = rn.nextInt(3) + 1;
		
		if (option < 4) {
			if (answer == 3) {
				if (option == 2)
					System.out.println("Behind door number 1 are goats!");
				else {
					System.out.println("Behind door number 2 are goats!");
				}
			} else if (answer == 2) {
				if (option == 1)
					System.out.println("Behind door number 3 are goats!");
				else {
					System.out.println("Behind door number 1 are goats!");
				}
			} else {
				if (option == 3)
					System.out.println("Behind door number 2 are goats!");
				else {
					System.out.println("Behind door number 3 are goats!");
				}
			}

			System.out.println("Do you want to change the door ? " + "y/n");
			change = scn.next().charAt(0);
			if (change == 'Y' || change == 'y') {
				System.out.println("Enter your new door number: ");
				option = scn.nextInt();
				if (answer == option) {
					System.out.println("You won");
				} else {
					System.out.println("You lose");
					System.out.println("You selected door :" + option);
					System.out.println("Car is behind door:" + answer);
				}
			} else if (change == 'N' || change == 'n') {
				if (answer == option) {
					System.out.println("You won");
				} else {
					System.out.println("You lose");
					System.out.println("You selected:" + option);
					System.out.println("Car is behind door:" + answer);
				}
			} else {
				System.out.println("Invalid entry!");
			}
		} else {
			System.out.println("Invalid entry!");
		}
		scn.close();
	}
}