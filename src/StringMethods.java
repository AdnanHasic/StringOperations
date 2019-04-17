
public class StringMethods {

	private String text;

	public StringMethods() {

	}

	public void setText(String text) {
		this.text = text;
	}

	public void stringLength(String text) {

		System.out.println("The length of a string : " + text.length());
	}

	public void evenPosition() {

		System.out.print("Characters on even position of an array : ");

		for (int i = 0; i < text.length(); i += 2) {

			System.out.print(text.charAt(i) + " ");
		}
	}

	public void oddPosition() {

		System.out.print("\nCharacters on odd position of an array : ");

		for (int i = 1; i < text.length(); i += 2) {

			System.out.print(text.charAt(i) + " ");
		}
	}

	public void isUppercaseOrLowercaseOrNotALetter() {

		int counterUppercaseChracters = 0;
		int counterNonLetter = 0;

		for (int i = 0; i < text.length(); i++) {

			if (Character.isUpperCase(text.charAt(i))) {

				counterUppercaseChracters++;
			} else if (!Character.isAlphabetic(text.charAt(i))) {

				counterNonLetter++;
			}
		}
		System.out.println("\nNumber of capital letters : " + counterUppercaseChracters);
		System.out.println("Number of lowercase : " + (text.length() - (counterUppercaseChracters) - counterNonLetter));
		System.out.println("Number of non-letter characters : " + counterNonLetter);

	}
}
