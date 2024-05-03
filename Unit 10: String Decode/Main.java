import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(convert("64 120 100 166 97 182"));
        System.out.println(decode(convert("64 120 100 166 97 182 ")));
    }

    public static String convert(String s) {
        // String input to array list conversion
        String[] nums = s.split(" ");
        String convert = "";

        // main loop
        for (String num : nums) {
            int asciiValue = Integer.parseInt(num);
            char character = (char) asciiValue;
            convert += character;
        }

        // return statement
        return convert;
    }

    public static String decode(String input) {
        // array for storage
        int[] iarr = new int[input.length()];
        String scramble = "";

        // if statement - checks if input is in correct format
        if (input.charAt(0) == '\1') {
            for (int i = 1; i < input.length(); i++) {
                if ((int) input.charAt(i) < 32)
                    iarr[i-1] = (int) input.charAt(i) + 95;
                else 
                    iarr[i-1] = (int) input.charAt(i);
            }
            for (int i = 0; i < iarr.length; i++) {
                scramble += (char) (iarr[i] - 10);
            }
            return scramble;

        // else statement - wrong input means scramble and repeat
        } else {
            for (int i = 0; i < input.length(); i++) {
                int num = (int) input.charAt(i) * 2 % 257;
                scramble += (char) num;
            }
            return decode(scramble);
        }
    }
}
