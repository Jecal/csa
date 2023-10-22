public class main {
	public static void main(String[] args) {
		Palindrome pali = new Palindrome();
		pali.setWord();
		if (pali.isPalindrome()) {
			System.out.println(pali.getWord() + " is a palindrome.");
		} else {
			System.out.println(pali.getWord() + " is not a palindrome.");
		}
	}
}