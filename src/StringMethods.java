
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

		System.out.println("Characters on even position of an array : ");

		for (int i = 0; i < text.length(); i += 2) {

			System.out.print(text.charAt(i) + " ");
		}
	}
}
