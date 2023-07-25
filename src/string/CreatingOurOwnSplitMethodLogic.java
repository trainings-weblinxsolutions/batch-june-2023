package string;

public class CreatingOurOwnSplitMethodLogic {
	public static void main(String[] args) {

		String sentence = "Today is a bright sunny day";
		System.out.println(sentence.length());
		// print length of each word in the string

		String word = "";

		for (int i = 0; i < sentence.length(); i++) {

			if (sentence.charAt(i) == ' ') {
				System.out.println(word + " Length is : " + word.length());
				word = "";

			} else {
				word = word + sentence.charAt(i);
			}

		}
		System.out.println(word + " Length is : " + word.length());

		/*
		 * 
		 * Today Length is : 6 Today is Length is : 9 Today is a Length is : 11 Today is
		 * a good Length is : 16 Today is a good bright Length is : 23
		 * 
		 */

	}
}
