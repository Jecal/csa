import java.util.Scanner;

public class Palindrome {
    String input;

    Scanner scan = new Scanner(System.in);

    public String setWord() {
        input = (scan.nextLine()).toLowerCase();
        return input;
    }

    public String getWord() {
        return input;
    }

    public boolean isPalindrome() {
        if (input.length() < 2) {
            return true;
        } else {
            int left = 0;
            int right = input.length() - 1;

            while (left < right) {
                if (input.charAt(left) != input.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}
