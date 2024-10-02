import java.util.Scanner;

public class import java.util.Scanner;

public class guessNumberGame {

	// Function that implements the
	// number guessing game
	public static void
	numberGameRandom()
	{
	    
	    int number = 1 + (int)(1000* Math.random());
		Scanner scanner = new Scanner(System.in);
		int tryCount = 30;

		int i,nextNumber;

		for (i = 0; i < tryCount; i++) {

			System.out.println("Please enter a number");
			nextNumber = scanner.nextInt();
			if (number == nextNumber) {
				System.out.println(
					"Congratulations! You win!");
				break;
			}
			else if (number > nextNumber
					&& i != tryCount - 1) {
				System.out.println(
					"Nice try!The number is greater than " + nextNumber);
			}
			else if (number < nextNumber
					&& i != tryCount - 1) {
				System.out.println("Nice try! The number is less than " + nextNumber);
			}
		}

		if (i == tryCount) {
			System.out.println(
				"You tried 30 times. Now the game is over.");

			System.out.println(
				"The number was " + number);
		}
	}
	public static void main(String arg[])
	{
		numberGameRandom();
	}
} {

	// Function that implements the
	// number guessing game
	public static void
	numberGameRandom()
	{
	    
	    int number = 1 + (int)(1000* Math.random());
		Scanner scanner = new Scanner(System.in);
		int tryCount = 30;

		int i,nextNumber;

		for (i = 0; i < tryCount; i++) {

			System.out.println("Please enter a number");
			nextNumber = scanner.nextInt();
			if (number == nextNumber) {
				System.out.println(
					"Congratulations! You win!");
				break;
			}
			else if (number > nextNumber
					&& i != tryCount - 1) {
				System.out.println(
					"Nice try!The number is greater than " + nextNumber);
			}
			else if (number < nextNumber
					&& i != tryCount - 1) {
				System.out.println("Nice try! The number is less than " + nextNumber);
			}
		}

		if (i == tryCount) {
			System.out.println(
				"You tried 30 times. Now the game is over.");

			System.out.println(
				"The number was " + number);
		}
	}
	public static void main(String arg[])
	{
		numberGameRandom();
	}
}
