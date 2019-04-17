import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		StringMethods stringMethods = new StringMethods();

		System.out.println("Enter the text : ");

		String text = input.nextLine();

		stringMethods.setText(text);

		stringMethods.stringLength(text);

		stringMethods.evenPosition();

		stringMethods.oddPosition();

		stringMethods.isUppercaseOrLowercaseOrNotALetter();
		
		input.close();

	}

}
